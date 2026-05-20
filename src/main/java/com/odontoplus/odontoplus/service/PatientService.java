package com.odontoplus.odontoplus.service;

import com.odontoplus.odontoplus.model.PatientModel;
import com.odontoplus.odontoplus.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

  public  PatientModel save(PatientModel patientModel){
        return repository.save(patientModel);
  }

  public List<PatientModel>list(){
        return repository.findAll();
  }

  public Optional<PatientModel>findByID(Long id){
        return repository.findById(id);
  }

  public PatientModel atualizar(PatientModel patientModel){
        return repository.save(patientModel);
  }

  public void excluir(Long id){
         repository.deleteById(id);
  }
}
