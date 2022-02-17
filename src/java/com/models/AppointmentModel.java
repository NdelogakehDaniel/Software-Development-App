
package com.models;

public class AppointmentModel {
    private int idappointment;
    private String date;
    private String description;
    private UserModel iduser;

    public int getIdappointment() {
        return idappointment;
    }

    public void setIdappointment(int idappointment) {
        this.idappointment = idappointment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserModel getIduser() {
        return iduser;
    }

    public void setIduser(UserModel iduser) {
        this.iduser = iduser;
    }
    
    
}
