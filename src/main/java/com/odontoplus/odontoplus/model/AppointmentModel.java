package com.odontoplus.odontoplus.model;

import com.odontoplus.odontoplus.Enum.AppointmentStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class AppointmentModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private LocalDateTime appointment;
    private String description;
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientModel patient;

    @ManyToOne
    @JoinColumn(name = "dentist_id")
    private DentistModel dentist;

    public AppointmentModel(){

    }

    public AppointmentModel(Long id, LocalDateTime appointment, String description, AppointmentStatus status, PatientModel patient, DentistModel dentist) {
        this.id = id;
        this.appointment = appointment;
        this.description = description;
        this.status = status;
        this.patient = patient;
        this.dentist = dentist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalDateTime appointment) {
        this.appointment = appointment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }

    public DentistModel getDentist() {
        return dentist;
    }

    public void setDentist(DentistModel dentist) {
        this.dentist = dentist;
    }
}