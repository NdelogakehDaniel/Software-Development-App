

package com.controller;

import com.connexion.*;
import com.models.AppointmentModel;
import com.models.UserModel;
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
public class AppointmentController {
    
   //function to get all meetings
   @GET
   @Path("/appointments")
   @Produces("application/json")
   public ArrayList<AppointmentModel> listappoint() throws Exception{
       ArrayList<AppointmentModel> appoints = new ArrayList<>();
       
       Statement st = Connexion.seconnecter().createStatement();
       ResultSet rs = st.executeQuery("select * from appointments");
       
       while(rs.next()){
           AppointmentModel oneappoint = new AppointmentModel();
           oneappoint.setIdappointment(rs.getInt("idappointment"));
           oneappoint.setDate(rs.getString("date"));
           oneappoint.setDescription(rs.getString("description"));
           oneappoint.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
           
           appoints.add(oneappoint);
       }
       
       return appoints;
   }
   
   
   //function to get one meeting
   @GET
   @Path("/appointments/{id}")
   @Produces("application/json")
   public ArrayList<AppointmentModel> getOneAppoint(@PathParam("id") int id) throws Exception{
       ArrayList<AppointmentModel> appoints = new ArrayList<>();
       
       Statement st = Connexion.seconnecter().createStatement();
       ResultSet rs = st.executeQuery("select * from appointments where iduser="+id);
       
       while(rs.next()){
           AppointmentModel oneappoint = new AppointmentModel();
           oneappoint.setIdappointment(rs.getInt("idappointment"));
           oneappoint.setDate(rs.getString("date"));
           oneappoint.setDescription(rs.getString("description"));
           oneappoint.setIduser(UserController.getOneUsers(rs.getInt("iduser")));
           
           appoints.add(oneappoint);
       }
       
       return appoints;
   }
   
   //function to add an appointment
   @POST
   @Path("/addAppointment")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces("application/json")
   
   public AppointmentModel addAppoint(AppointmentModel appoints) throws Exception{
       AppointmentModel appt = new AppointmentModel();
       String sql = "insert into appointments (iduser,date,description) values (?,?,?)";
      try{
          PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
          System.out.println("Value: "+appoints.getIduser().getIduser());
          prep.setInt(1,appoints.getIduser().getIduser());
          prep.setString(2,appoints.getDate());
          prep.setString(3,appoints.getDescription());
          
          if(prep.executeUpdate()==1){
              appt.setIduser(appoints.getIduser());
              appt.setDate(appoints.getDate());
              appt.setDescription(appoints.getDescription());
          }
          
      }catch(Exception e){
          System.out.println("Error Message: "+e.getMessage());
      }
       
       return appt;
   }
   
   //function to update an appointment
   @PUT
   @Path("/updateAppointment/{id}")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces("application/json")
   
   public AppointmentModel updateAppoint(@PathParam("id") int id,AppointmentModel appoints) throws Exception{
       AppointmentModel appt = new AppointmentModel();
       String sql = "update appointments set date=?,description=? where idappointment="+id;
      try{
          PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
          
          prep.setString(1,appoints.getDate());
          prep.setString(2,appoints.getDescription());
          
          if(prep.executeUpdate()==1){
              appt.setDate(appoints.getDate());
              appt.setDescription(appoints.getDescription());
          }
          
      }catch(Exception e){
          System.out.println("Error Message: "+e.getMessage());
      }
       
       return appt;
   }
   
  //function to delete a meeting
   @DELETE
   @Path("/deleteAppointment/{id}")
   @Produces("appication/json")
   public ArrayList<AppointmentModel> deleteAppoint(@PathParam("id") int id) throws Exception{
       ArrayList delAppoint = new ArrayList();
       try{
           String sql = "delete from appointments where idappointment="+id;
           PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
           
           if(prep.executeUpdate()==1){
               
               delAppoint = this.getOneAppoint(id);
               
               return delAppoint;
           }
           
           
       }catch(Exception e){
           System.out.println("Error message: "+e.getMessage());
       }
       
       return delAppoint;
   }
   
}
