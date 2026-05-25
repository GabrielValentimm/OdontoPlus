package com.odontoplus.odontoplus.controller;

import com.odontoplus.odontoplus.model.DentistModel;
import com.odontoplus.odontoplus.service.DentistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    private DentistService service;

    public DentistController(DentistService dentistService) {
        this.service = dentistService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<DentistModel>> list(){
    List<DentistModel> list = service.list();
    return ResponseEntity.ok(list);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<DentistModel> up(@RequestBody DentistModel dentistModel, @PathVariable Long id) {
        return service.findById(id)
                .map(dentistExist -> {
                    dentistModel.setId(dentistExist.getId());
                    DentistModel atualizar = service.atualizar(dentistModel);
                    return ResponseEntity.ok(atualizar);
                }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/criar")
    public ResponseEntity<DentistModel> Create(@RequestBody DentistModel dentistModel){
        DentistModel save = service.save(dentistModel);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/deletar/{id}")
    ResponseEntity<Void> excluir(Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}