CREATE TABLE appointment (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     appointment_date TIMESTAMP,
     description VARCHAR(255),
     status VARCHAR(255),
     patient_id BIGINT,
     dentist_id BIGINT,
        CONSTRAINT fk_patient
            FOREIGN KEY (patient_id)
                REFERENCES patient(id),

                             CONSTRAINT fk_dentist
                                 FOREIGN KEY (dentist_id)
                                     REFERENCES dentist(id)
);