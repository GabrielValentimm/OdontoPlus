package com.odontoplus.odontoplus.controller;

import com.odontoplus.odontoplus.model.AppointmentModel;
import com.odontoplus.odontoplus.model.DentistModel;
import com.odontoplus.odontoplus.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AppointmentController {

    private AppointmentService service;

    // Get
    @GetMapping
    public ResponseEntity<List<AppointmentModel>> list(){
        List<AppointmentModel> list = service.list();
        return ResponseEntity.ok(list);
    }


    @PutMapping("/{id}")
    public ResponseEntity<AppointmentModel> up(@RequestBody AppointmentModel appointmentModel, @PathVariable Long id) {
        return service.findById(id)
                .map(dentistExist -> {
                    appointmentModel.setId(dentistExist.getId());
                    AppointmentModel atualizar = service.atualizar(appointmentModel);
                    return ResponseEntity.ok(atualizar);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Post
    @PostMapping
    public ResponseEntity<AppointmentModel> create(@RequestBody AppointmentModel appointmentModel){
        AppointmentModel save = service.save(appointmentModel);
        return ResponseEntity.ok(save);
    }

    ResponseEntity<Void>excluir(Long id){
        service.excluir(id);
       return ResponseEntity.noContent().build();
    }
}
