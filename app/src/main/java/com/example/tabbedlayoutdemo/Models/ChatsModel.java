package com.example.tabbedlayoutdemo.Models;

public class ChatsModel {
    int image;
    String contact_name, message, date;

    public ChatsModel(int image, String contact_name, String message, String date) {
        this.image = image;
        this.contact_name = contact_name;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
