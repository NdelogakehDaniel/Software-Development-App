
package com.controller;

import com.connexion.Connexion;
import com.models.ProjectMediaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ProjectMediaController {
     //function to get all project media
    @GET
    @Path("/projectmedias")
    @Produces("application/json")
    
    public ArrayList<ProjectMediaModel> listprojectmedia() throws Exception{
        ArrayList<ProjectMediaModel> projectmedia = new ArrayList<>();
        try{
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from projectmedia");
            
            while(rs.next()){
                ProjectMediaModel oneprojectmedia = new ProjectMediaModel();
                oneprojectmedia.setIdprojectmedia(rs.getInt("idprojectmedia"));
                oneprojectmedia.setName(rs.getString("name"));
                oneprojectmedia.setPath(rs.getString("path"));
                oneprojectmedia.setSize(rs.getInt("size"));
                oneprojectmedia.setType(rs.getString("type"));
                oneprojectmedia.setIdproject(ProjectController.getOneProject(rs.getInt("idproject")));
                
                projectmedia.add(oneprojectmedia);
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return projectmedia;
    }
    
    //function to get one project media
    @GET
    @Path("/projectmedias/{id}")
    @Produces("application/json")
    
    public static ProjectMediaModel getOneProjectmedia(@PathParam("id") int id) throws Exception{
         ProjectMediaModel oneprojectmedia = new ProjectMediaModel();
        try{
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from projectmedia");
            
            while(rs.next()){
                oneprojectmedia.setIdprojectmedia(rs.getInt("idprojectmedia"));
                oneprojectmedia.setName(rs.getString("name"));
                oneprojectmedia.setPath(rs.getString("path"));
                oneprojectmedia.setSize(rs.getInt("size"));
                oneprojectmedia.setType(rs.getString("type"));
                oneprojectmedia.setIdproject(ProjectController.getOneProject(rs.getInt("idproject")));
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return oneprojectmedia;
    }
    
    //function to add a new ProjectMedia
    @POST
    @Path("/addProjectmedia")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public String addProjectmedia(ProjectMediaModel model) throws Exception{
        String result ="failed";
        try{
            String sql = "insert into projectmedia (name,path,size,type,idproject) values (?,?,?,?,?)";
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getName());
            prep.setString(2,model.getPath());
            prep.setInt(3,model.getSize());
            prep.setString(4,model.getType());
            prep.setInt(5, model.getIdproject().getIdproject());
            
            if(prep.executeUpdate()==1)
                result ="success";
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        return result;
    }
    
     //function to update ProjectMedia
    @POST
    @Path("/updateProjectmedia/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public String updateProjectmedia(@PathParam("id") int id,ProjectMediaModel model) throws Exception{
        String result ="failed";
        try{
            String sql = "update projectmedia set name=?,path=?,size=?,type=? where idprojectmedia="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getName());
            prep.setString(2,model.getPath());
            prep.setInt(3,model.getSize());
            prep.setString(4,model.getType());
            
            if(prep.executeUpdate()==1)
                result ="success";
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        return result;
    }
    
    //function to delete a project media
    @DELETE
    @Path("/deleteProjectmedia/{id}")
    @Produces("application/json")
    
    public String deleteProjectmedia(@PathParam("id") int id) throws Exception{
        String result = "failed";
         try{
            String sql = "delete from projectmedia where idprojectmedia="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            if(prep.executeUpdate()==1)
                result ="success";
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;
    }
    
}
