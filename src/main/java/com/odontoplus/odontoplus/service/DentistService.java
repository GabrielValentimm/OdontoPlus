package com.odontoplus.odontoplus.service;

import com.odontoplus.odontoplus.model.DentistModel;
import com.odontoplus.odontoplus.repository.DentistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistService {
    private DentistRepository repository;

    public DentistService(DentistRepository dentistRepository) {
        this.repository = repository;
    }

    public DentistModel save(DentistModel dentistModel){
     return repository.save(dentistModel);
    }

    public List<DentistModel>list(){
        return repository.findAll();
    }

    public Optional<DentistModel> findById(Long id){
        return repository.findById(id);
    }

    public DentistModel atualizar(DentistModel dentistModel){
        return repository.save(dentistModel);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}
