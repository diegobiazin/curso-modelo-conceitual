package com.diegobiazin.cursomc.resources;

import com.diegobiazin.cursomc.domain.Cliente;
import com.diegobiazin.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Cliente obj = clienteService.buscar(id);
        return ResponseEntity.ok(obj);
    }
}
