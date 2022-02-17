package com.models;

public class MeetingModel {
    private int idmeetings; 
    private String code;   
    private String password;
    private String start;
    private String end;
    private UserModel iduser;

    public int getIdmeetings() {
        return idmeetings;
    }

    public void setIdmeetings(int idmeetings) {
        this.idmeetings = idmeetings;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public UserModel getIduser() {
        return iduser;
    }

    public void setIduser(UserModel iduser) {
        this.iduser = iduser;
    }
    
    
}
