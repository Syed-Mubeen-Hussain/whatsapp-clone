package com.example.tabbedlayoutdemo.Models;

public class StatusModel {
    int image;
    String contact_name, date;

    public StatusModel(int image, String contact_name, String date) {
        this.image = image;
        this.contact_name = contact_name;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
