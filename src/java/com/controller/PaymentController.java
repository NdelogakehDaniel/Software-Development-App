
package com.controller;

import com.models.PaymentModel;
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
public class PaymentController {
    
   //function to display all payments 
   @GET
   @Path("/payment")
   @Produces("application/json")
   
   public ArrayList<PaymentModel> listpayment() throws Exception{
       ArrayList list = new ArrayList<>();
       try{
           Statement st = com.connexion.Connexion.seconnecter().createStatement();
           ResultSet rs = st.executeQuery("select * from payment where status=enable");
           
           while(rs.next()){
               PaymentModel model = new PaymentModel();
               model.setIdpayment(rs.getInt("idpayment"));
               model.setIduser(rs.getInt("iduser"));
               model.setAmount(rs.getFloat("amount"));
               model.setDescription(rs.getString("description"));
               model.setDate(rs.getTimestamp("date"));
               model.setProjectid(rs.getInt("projectid"));
               
               list.add(model);
           }
           
       }catch(Exception e){
           System.out.println("Error Message: "+e.getMessage());
       }
       
       return list;
   }
   
   //function to get one payment 
   @GET
   @Path("/payment/{id}")
   @Produces("application/json")
   
   public ArrayList<PaymentModel> getOnePayment(@PathParam("id") int id) throws Exception{
       ArrayList list = new ArrayList<>();
       try{
           Statement st = com.connexion.Connexion.seconnecter().createStatement();
           ResultSet rs = st.executeQuery("select * from payment where idpayment="+id);
           
           while(rs.next()){
               PaymentModel model = new PaymentModel();
               model.setIdpayment(rs.getInt("idpayment"));
               model.setIduser(rs.getInt("iduser"));
               model.setAmount(rs.getFloat("amount"));
               model.setDescription(rs.getString("description"));
               model.setDate(rs.getTimestamp("date"));
               model.setProjectid(rs.getInt("projectid"));
               
               list.add(model);
           }
           
       }catch(Exception e){
           System.out.println("Error Message: "+e.getMessage());
       }
       
       return list;
   }
   
   //get all the payments correspondng to that payment
   @GET
   @Path("/projectPayment/{projectid}")
   @Produces("application/json")
   
   public ArrayList<PaymentModel> listAllProjectPayments(@PathParam("projectid") int projectid) throws Exception{
       ArrayList list = new ArrayList<>();
       try{
           Statement st = com.connexion.Connexion.seconnecter().createStatement();
           ResultSet rs = st.executeQuery("select * from payment where projectid="+projectid);
        
           while(rs.next()){
               PaymentModel model = new PaymentModel();
               model.setIdpayment(rs.getInt("idpayment"));
               model.setIduser(rs.getInt("iduser"));
               model.setAmount(rs.getFloat("amount"));
               model.setDescription(rs.getString("description"));
               model.setDate(rs.getTimestamp("date"));
               model.setProjectid(rs.getInt("projectid"));
               
               list.add(model);
           }
           
       }catch(Exception e){
           System.out.println("Error Message: "+e.getMessage());
       }
       
       return list;
   }
   
   //function to display sum of all payments
   @GET
   @Path("/totalpayment")
   @Produces("application/json")
   
   public String getTotalPayment() throws Exception{
      String total = "";
       try{
           Statement st = com.connexion.Connexion.seconnecter().createStatement();
           ResultSet rs = st.executeQuery("select sum(amount) as result from payment");
           
           while(rs.next()){
               total = String.valueOf(rs.getFloat("result"));
           }  
       }catch(Exception e){
           System.out.println("Error Message: "+e.getMessage());
       }
       return total;
   }
   
   //function to get sum paid for a particular project
   @GET
   @Path("/sum_project_amount/{id}")
   @Produces("application/json")
   
   public float getSumProject(@PathParam("id") int id) throws Exception{
      float total = 0;
       try{
           Statement st = com.connexion.Connexion.seconnecter().createStatement();
           ResultSet rs = st.executeQuery("select sum(amount) as result from payment where projectid="+id);
           
           while(rs.next()){
               total = Float.valueOf(String.valueOf(rs.getFloat("result")));
           }  
       }catch(Exception e){
           System.out.println("Error Message: "+e.getMessage());
       }
       return total;
   }
   
   
   //function to add a new payment
   @POST
   @Path("/addPayment")
   @Consumes(MediaType.APPLICATION_JSON)
   public void addPayment(PaymentModel payment){
       PaymentModel model = new PaymentModel();
       String sql = "insert into payment (iduser,amount,description,projectid) values (?,?,?,?)";
       try{
       PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
       prep.setInt(1, payment.getIduser());
       prep.setFloat(2, payment.getAmount());
       prep.setString(3,payment.getDescription());
       prep.setInt(4, payment.getProjectid());
       
       if(prep.executeUpdate()==1){
           System.out.println("Payment Added Successfully");
       }
       
       }catch(Exception e){
           System.out.println("Error message: "+e.getMessage());
       }
   }
   
   //function to delete a payment
   @DELETE
   @Path("/deletePayment/{id}")
   @Produces("application/json")
   
   public ArrayList<PaymentModel> deletePayment(@PathParam("id") int id) throws Exception{
       ArrayList res = new ArrayList<>();
       try{
           String sql ="update payment set status=disable where id="+id;
           PreparedStatement prep = com.connexion.Connexion.seconnecter().prepareStatement(sql);
           if(prep.executeUpdate()==1){
               
               res = this.getOnePayment(id);
           }
       }catch(Exception e){
           System.out.println("Error message: "+e.getMessage());
       }
       
       return res;
   }
}
