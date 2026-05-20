package com.odontoplus.odontoplus.repository;

import com.odontoplus.odontoplus.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {
}
