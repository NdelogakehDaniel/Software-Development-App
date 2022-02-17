
package com.models;

public class ProjectMediaModel {
    private int idprojectmedia;
    private String name;
    private String path;
    private int size;
    private String type;
    private ProjectModel idproject;

    public int getIdprojectmedia() {
        return idprojectmedia;
    }

    public void setIdprojectmedia(int idprojectmedia) {
        this.idprojectmedia = idprojectmedia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProjectModel getIdproject() {
        return idproject;
    }

    public void setIdproject(ProjectModel idproject) {
        this.idproject = idproject;
    }
    
    
}
