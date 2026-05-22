package com.odontoplus.odontoplus.repository;

import com.odontoplus.odontoplus.model.DentistModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<DentistModel, Long> {
}
