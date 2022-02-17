
package com.controller;

import com.connexion.Connexion;
import com.models.ProjectModel;
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


@Path("")
public class ProjectController {

    //function to get all projects
    @GET
    @Path("/projects")
    @Produces("application/json")
    
    public ArrayList<ProjectModel> getAllProjects() throws Exception{
        ArrayList<ProjectModel> projects = new ArrayList<>();
        try{
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from projects");
            
            while(rs.next()){
                ProjectModel oneproject = new ProjectModel();
                oneproject.setIdproject(rs.getInt("idproject"));
                oneproject.setDescription(rs.getString("description"));
                oneproject.setBudget(rs.getFloat("budget"));
                oneproject.setStartdate(rs.getDate("startdate"));
                oneproject.setEnddate(rs.getDate("enddate"));
                oneproject.setType(rs.getString("type"));
                oneproject.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
                
                projects.add(oneproject);
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return projects;
    }
   
    
    //function to get one project
    @GET
    @Path("/projects/{id}")
    @Produces("application/json")
    
    public static ProjectModel getOneProject(@PathParam("id") int id) throws Exception{
        ProjectModel oneproject = new ProjectModel();
        try{
             Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from projects where idproject="+id);
            
            while(rs.next()){
                oneproject.setIdproject(rs.getInt("idproject"));
                oneproject.setDescription(rs.getString("description"));
                oneproject.setBudget(rs.getFloat("budget"));
                oneproject.setStartdate(rs.getDate("startdate"));
                oneproject.setEnddate(rs.getDate("enddate"));
                oneproject.setType(rs.getString("type"));
                oneproject.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return oneproject;
    }
    
    
    
    //function to add a new project
    @POST
    @Path("/addProject")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({"application/json"})
    
    public String addProject(ProjectModel model) throws Exception{
        String result = "failed";
        try{
            String sql = "insert into projects (description,budget,startdate,enddate,type,iduser) values (?,?,?,?,?,?)";
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getDescription());
            prep.setFloat(2,model.getBudget());
            prep.setDate(3, model.getStartdate());
            prep.setDate(4,model.getEnddate());
            prep.setString(5,model.getType());
            prep.setInt(6,model.getIduser().getIduser());
            
            if(prep.executeUpdate()==1){
                result = "success";
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;
    }
    
    //function to add a new project
    @PUT
    @Path("/updateProject/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({"application/json"})
    
    public String updateProject(@PathParam("id" ) int id,ProjectModel model) throws Exception{
        String result = "failed";
        try{
            String sql = "update projects set description=?,startdate=?,enddate=?,type=? where idproject="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            prep.setString(1,model.getDescription());
            prep.setDate(2, model.getStartdate());
            prep.setDate(3,model.getEnddate());
            prep.setString(4,model.getType());
            
            if(prep.executeUpdate()==1){
                result = "success";
            }
            
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
        
        return result;
    }
    
    //function to delete a project
    @DELETE
    @Path("/deleteProject/{id}")
    @Produces("application/json")
    public String deleteProject(@PathParam("id") int id) throws Exception{
        String result = "failed";
        try{
            String sql = "delete from projects where idproject="+id;
            PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
            
            if(prep.executeUpdate()==1){
                 result = "success";
            }
        }catch(Exception e){
            System.out.println("Erroe Message: "+e.getMessage());
        }
        
        return result;
    }
}
