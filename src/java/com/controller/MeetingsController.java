

package com.controller;

import com.models.MeetingModel;
import com.connexion.*;
import com.models.UserModel;
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
public class MeetingsController {
    
   //function to get all meetings
   @GET
   @Path("/meetings")
   @Produces("application/json")
   public ArrayList<MeetingModel> listmeeting() throws Exception{
       ArrayList<MeetingModel> meetings = new ArrayList<>();
       
       Statement st = Connexion.seconnecter().createStatement();
       ResultSet rs = st.executeQuery("select * from meetings");
       
       while(rs.next()){
           MeetingModel onemeeting = new MeetingModel();
           onemeeting.setIdmeetings(rs.getInt("idmeetings"));
           onemeeting.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
           onemeeting.setCode(rs.getString("code"));
           onemeeting.setPassword(rs.getString("password"));
           onemeeting.setStart(rs.getString("start"));           
           onemeeting.setEnd(rs.getString("end"));
           
           meetings.add(onemeeting);
       }
       
       return meetings;
   }
   
    //function to get one meetings
   @GET
   @Path("/meetings/{id}")
   @Produces("application/json")
   public ArrayList<MeetingModel> getOneMeeting(@PathParam("id") int id) throws Exception{
       ArrayList<MeetingModel> meetings = new ArrayList<>();
       
       Statement st = Connexion.seconnecter().createStatement();
       ResultSet rs = st.executeQuery("select * from meetings where idmeetings="+id);
       
       while(rs.next()){
           MeetingModel onemeeting = new MeetingModel();
           onemeeting.setIdmeetings(rs.getInt("idmeetings"));
           onemeeting.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
           onemeeting.setCode(rs.getString("code"));
           onemeeting.setPassword(rs.getString("password"));
           onemeeting.setStart(rs.getString("start"));           
           onemeeting.setEnd(rs.getString("end"));
           
           meetings.add(onemeeting);
       }
       
       return meetings;
   }
   
   //function to add a new user
   @POST
   @Path("/addMeeting")
   @Produces("application/json")
   
   public int addMeeting(MeetingModel meeting) throws Exception{
       try{
           String sql = "insert into meetings (iduser,code,password,start,end) values(?,?,?,?,?)";
           PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
           
           prep.setInt(1,meeting.getIduser().getIduser());
           prep.setString(2,meeting.getCode());
           prep.setString(3,meeting.getPassword());
           prep.setString(4,meeting.getStart());
           prep.setString(5,meeting.getEnd());
           
            if(prep.executeUpdate()==1){
                return 1;
            }
       }catch(Exception e){
           System.out.println("Error message: "+e.getMessage());
       }
       
       return 0;
   } 
   
  //function to delete a meeting
   @DELETE
   @Path("/deleteMeeting/{id}")
   @Produces("appication/json")
   public UserModel deleteUser(@PathParam("id") int id) throws Exception{
       try{
           String sql = "delete from meetings where idmeetings="+id;
           PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
           prep.executeUpdate();
           
           return UserController.getOneUsers(id);
           
       }catch(Exception e){
           System.out.println("Error message: "+e.getMessage());
       }
       
       return null;
   }
   
}
