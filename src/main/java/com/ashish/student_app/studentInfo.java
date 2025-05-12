package com.ashish.student_app;

import jakarta.persistence.*;

@Entity
@Table(name = "student_info")
public class studentInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    public studentInfo(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public studentInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
