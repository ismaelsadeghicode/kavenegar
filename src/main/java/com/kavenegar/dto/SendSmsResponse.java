package com.kavenegar.dto;

import java.util.Date;

public class SendSmsResponse {
    private long messageid;
    private int message;
    private int status;
    private String statustext;
    private String sender;
    private String receptor;
    private Date unixTime;
    private int cost;

    public long getMessageid() {
        return messageid;
    }

    public void setMessageid(long messageid) {
        this.messageid = messageid;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatustext() {
        return statustext;
    }

    public void setStatustext(String statustext) {
        this.statustext = statustext;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(Date unixTime) {
        this.unixTime = unixTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
