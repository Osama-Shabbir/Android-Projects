package com.example.osama.gitfirstapp;

/**
 * Created by Osama on 10/11/2017.
 */

public class Student {
    private String name;
    private String phone;
    private String email;


    public  Student(String name,String phone,String email){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public String getPhone() {

        return phone;
    }

    public String getName() {

        return name;
    }
}
