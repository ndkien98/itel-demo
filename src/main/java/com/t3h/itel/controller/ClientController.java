package com.t3h.itel.controller;

import com.t3h.itel.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    public final ClientService clientService;

    @GetMapping()
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(clientService.getAll());
    }
}
