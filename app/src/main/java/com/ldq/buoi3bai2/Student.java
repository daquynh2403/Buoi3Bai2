package com.ldq.buoi3bai2;

public class Student {
    String id;
    String name;

    public Student(String id, String name, String cl_ass, String phone, String email) {
        this.id = id;
        this.name = name;
        this.cl_ass = cl_ass;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCl_ass() {
        return cl_ass;
    }

    public void setCl_ass(String cl_ass) {
        this.cl_ass = cl_ass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String cl_ass;
    String phone;
    String email;
    @Override
    public String toString(){
        return this.getName() + " - " +this.getId();
    }
}
