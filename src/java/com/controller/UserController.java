
package com.controller;

import com.connexion.Connexion;
import com.models.UserModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class UserController {
    //function to display all users
    @GET
    @Path("/users")
    @Produces("application/json")
    
    public ArrayList<UserModel> listUsers() throws Exception{
        ArrayList<UserModel> listuser = new ArrayList<>();
        try{
            
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from users");
            
            while(rs.next()){
                
                UserModel oneuser = new UserModel();
                oneuser.setIduser(rs.getInt("iduser"));
                oneuser.setName(rs.getString("name"));                
                oneuser.setUsername(rs.getString("username"));                
                oneuser.setEmail(rs.getString("email"));
                oneuser.setPassword(rs.getString("password"));
                oneuser.setCity(rs.getString("city"));
                oneuser.setCountry(rs.getString("country"));
                oneuser.setTel(rs.getString("tel"));
                oneuser.setStatus(rs.getString("status"));
                oneuser.setRole(rs.getString("role"));

                listuser.add(oneuser);
            }
            
        }catch(Exception e){
            System.out.println("Error Loading data: "+e.getMessage());
        }
        
        return listuser;
    }
    
    //function to get oneuser
    @GET
    @Path("/users/{id}")
    @Produces("application/json")
    
    public static UserModel getOneUsers(@PathParam("id") int id) throws Exception{
       UserModel oneuser = new UserModel();
        try{
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery("select * from users where iduser="+id);
            
            while(rs.next()){
                oneuser.setIduser(rs.getInt("iduser"));
                oneuser.setName(rs.getString("name"));                
                oneuser.setUsername(rs.getString("username"));                
                oneuser.setEmail(rs.getString("email"));
                oneuser.setPassword(rs.getString("password"));
                oneuser.setCity(rs.getString("city"));
                oneuser.setCountry(rs.getString("country"));
                oneuser.setTel(rs.getString("tel"));
                oneuser.setStatus(rs.getString("status"));
                oneuser.setRole(rs.getString("role"));

            }
            
        }catch(Exception e){
            System.out.println("Error Loading data: "+e.getMessage());
        }
        
        return oneuser;
    }
    
    //function to add a new user 
    @POST
    @Path("/addUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    public void addUser(UserModel user) throws Exception{
        try{
            String sql = "insert into users (name,username,email,password,city,country,tel,status,role) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = Connexion.seconnecter().prepareStatement(sql);
            
            st.setString(1,user.getName());
            st.setString(2,user.getUsername());
            st.setString(3,user.getEmail());
            st.setString(4,user.getPassword());
            st.setString(5,user.getCity());
            st.setString(6,user.getCountry());
            st.setString(7,user.getTel());
            st.setString(8,user.getStatus());
            st.setString(9, user.getRole());
            
            st.executeUpdate();
            
            System.out.println("User added successfully");
        
        }catch(Exception e){
            System.out.println("Error Message: "+e.getMessage());
        }
    }
    
    @PUT
    @Path("/updateUser/{iduser}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public void updateUser(@PathParam("iduser") int iduser,UserModel user) throws Exception{
        try{
        String sql = "update users set name=? , username=? , email=? , password=? where iduser="+iduser;
        PreparedStatement st = Connexion.seconnecter().prepareStatement(sql);
        
        st.setString(1, user.getName());
        st.setString(2, user.getUsername());
        st.setString(3, user.getEmail());
        st.setString(4, user.getPassword());
        
        st.executeUpdate();
        System.out.println("User updated successfully !!!");
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
        }
    }
    
    //function to delete a user
    @DELETE
    @Path("/deleteUser/{iduser}")
    @Produces("application/json")
    
    public int deleteUser(@PathParam("iduser") int iduser){
        try{
            String sql = "delete from users where iduser="+iduser;
            PreparedStatement st = Connexion.seconnecter().prepareStatement(sql);
            st.executeUpdate();
            
        }catch(Exception e){
            System.out.println("Error during delete of user with id: "+iduser);
            System.out.println("Error message: "+e.getMessage());
        }
        
        return iduser;
    }
    
    //function to login/authenticate a user
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    
    public UserModel loginUser(UserModel user) throws Exception{
        UserModel model = new UserModel();
        try{
            String sql = "select * from users";
            Statement st = Connexion.seconnecter().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               if(rs.getString("email").equals(user.getEmail()) && rs.getString("password").equals(user.getPassword())){
                model.setIduser(rs.getInt("iduser"));
                model.setName(rs.getString("name"));                
                model.setUsername(rs.getString("username"));                
                model.setEmail(rs.getString("email"));
                model.setPassword(rs.getString("password"));
                model.setTel(rs.getString("tel"));
                model.setRole(rs.getString("role"));
               }
            }
            
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
        }
        
        return model;
    }
    
}
