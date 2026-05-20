package com.odontoplus.odontoplus.controller;

import com.odontoplus.odontoplus.model.PatientModel;
import com.odontoplus.odontoplus.repository.PatientRepository;
import com.odontoplus.odontoplus.service.PatientService;
import jakarta.persistence.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private PatientService service;

    public PatientController(PatientService patientService) {
        this.service = patientService;
    }

    @GetMapping
    public ResponseEntity<List<PatientModel>> list(PatientModel patientModel) {
        List<PatientModel> list = service.list();
        return ResponseEntity.ok(list);
    }
    @PutMapping
   public ResponseEntity<PatientModel> up(@RequestBody PatientModel patientModel, @PathVariable Long Id){
        return service.findByID(Id)
                .map(pacientxistent ->{
                patientModel.setId(pacientxistent.getId());
                PatientModel Atualizado = service.atualizar(patientModel);
                return ResponseEntity.ok(Atualizado);
                }) .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping
    ResponseEntity<Void> excluir(Long id){
    service.excluir(id);
    return ResponseEntity.noContent().build();
    }


    @PostMapping
    public ResponseEntity<PatientModel> create(@RequestBody PatientModel patientModel){
        PatientModel save = service.save(patientModel);
        return ResponseEntity.ok(save);
    }

}
