package com.odontoplus.odontoplus.service;

import com.odontoplus.odontoplus.model.AppointmentModel;
import com.odontoplus.odontoplus.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    private AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public AppointmentModel save(AppointmentModel appointmentModel){
        return repository.save(appointmentModel);
    }

    public List<AppointmentModel> list(){
        return repository.findAll();
    }

    public Optional<AppointmentModel>findById(Long id){
        return repository.findById(id);
    }
    public AppointmentModel atualizar(AppointmentModel appointmentModel){
        return repository.save(appointmentModel);
    }

    public void excluir(Long id){
         repository.deleteById(id);
    }
}
