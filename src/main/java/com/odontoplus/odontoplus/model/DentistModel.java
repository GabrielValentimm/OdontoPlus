package com.odontoplus.odontoplus.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dentist")
public class DentistModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String specialty;
    private String cro;
    private String phone;
    private String email;

    public  DentistModel(){

    }
    public DentistModel(Long id, String name, String specialty, String cro, String phone, String email) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.cro = cro;
        this.phone = phone;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
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
}
