
package com.models;

import java.sql.Timestamp;

public class ProgressModel {
    private int idprogress;
    private String description;
    private int percentage;
    private Timestamp date;
    private ProjectModel idproject;

    public int getIdprogress() {
        return idprogress;
    }

    public void setIdprogress(int idprogress) {
        this.idprogress = idprogress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public ProjectModel getIdproject() {
        return idproject;
    }

    public void setIdproject(ProjectModel idproject) {
        this.idproject = idproject;
    }
    
    
}
