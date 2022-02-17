package com.models;

import java.sql.Date;

public class ProjectModel {
    private int idproject;
    private String description;
    private float budget;
    private Date startdate;    
    private Date enddate;
    private String type;
    private UserModel iduser;

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserModel getIduser() {
        return iduser;
    }

    public void setIduser(UserModel iduser) {
        this.iduser = iduser;
    }
    
    
}
