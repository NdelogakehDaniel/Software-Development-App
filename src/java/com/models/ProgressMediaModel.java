
package com.models;


public class ProgressMediaModel {
    private int idprogressmedia;
    private String name;
    private String path;
    private int size;
    private String type;
    private ProgressModel idprogress;

    public int getIdprogressmedia() {
        return idprogressmedia;
    }

    public void setIdprogressmedia(int idprogressmedia) {
        this.idprogressmedia = idprogressmedia;
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

    public ProgressModel getIdprogress() {
        return idprogress;
    }

    public void setIdprogress(ProgressModel idprogress) {
        this.idprogress = idprogress;
    }
    
    
}
