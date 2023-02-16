package com.studenten.studentenapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "studentstable")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

   // @Column(name = "name",nullable = false)
    private String name;
    //@Column(name = "nachname")
    private String  nachname;
   // @Column(name = "email")
    private String email;


    public Student(){}
    public Student(String name, String nachname, String email) {
        super();
        this.name = name;
        this.nachname = nachname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
