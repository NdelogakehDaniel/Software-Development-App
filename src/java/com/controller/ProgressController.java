
package com.controller;

import com.models.ProgressModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/progress")
public class ProgressController {
     //function to get all project progress
    @GET
    @Path("/listprogress")
    @Produces("application/json")
    
    public ArrayList<ProgressModel> listprogress () throws Exception{
        ArrayList<ProgressModel> progress = new ArrayList<>();
        
        try{
            Statement st= com.connexion.Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from progress");
            while(rs.next()){
                ProgressModel oneprogress = new ProgressModel();
                oneprogress.setIdprogress(rs.getInt("idprogress"));
                oneprogress.setDescription(rs.getString("description"));
                oneprogress.setPercentage(rs.getInt("percentage"));
                oneprogress.setDate(rs.getTimestamp("date"));
                oneprogress.setIdproject(ProjectController.getOneProject(rs.getInt("idproject")));
                
                progress.add(oneprogress);
            }
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return progress;
    }
    
     //function to get one project progress
    @GET
    @Path("/listprogress/{id}")
    @Produces("application/json")
    
    public static ProgressModel listOneProgress(@PathParam("id") int id) throws Exception{
        ProgressModel oneprogress = new ProgressModel();
        try{
            Statement st= com.connexion.Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from progress where idprogress="+id);
            while(rs.next()){
                oneprogress.setIdprogress(rs.getInt("idprogress"));
                oneprogress.setDescription(rs.getString("description"));
                oneprogress.setPercentage(rs.getInt("percentage"));
                oneprogress.setDate(rs.getTimestamp("date"));
                oneprogress.setIdproject(ProjectController.getOneProject(rs.getInt("idproject")));
                
            }
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return oneprogress;
    }
    
    //function to init a new progress for a project
    @POST
    @Path("/addprogress")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public String addprogress(ProgressModel model) throws Exception{
        String result="failed";
        
        try{
            String sql = "insert into progress (description,percentage,idproject) values (?,?,?)";
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getDescription());
            prep.setInt(2,model.getPercentage());
            prep.setInt(3,model.getIdproject().getIdproject());
            
            if(prep.executeUpdate()==1)
                result = "success";
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;   
    }
    
    //function to update a users 
    @PUT
    @Path("/updateprogress/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public String updateProgress(@PathParam("id") int id,ProgressModel model) throws Exception{
        String result="failed";
        
        try{
            String sql = "update progress set description=?,percentage=?,idproject=? where idprogress="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getDescription());
            prep.setInt(2,model.getPercentage());
            prep.setInt(3,model.getIdproject().getIdproject());
            
            if(prep.executeUpdate()==1)
                result = "success";
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;   
    }
    
    //function to delete a project progress
    @DELETE
    @Path("/delete/{id}")
    @Produces("application/json")
    
    public String deleteProgress(@PathParam("id") int id) throws Exception{
        String result ="failed";
        
        try{
            String sql = "delete from progress where idproject="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            if(prep.executeUpdate()==1)
                result = "success";
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;
    }
}
