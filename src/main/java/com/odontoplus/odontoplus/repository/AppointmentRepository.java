package com.odontoplus.odontoplus.repository;

import com.odontoplus.odontoplus.model.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long> {
}
