package com.corhuila.electivaii.Controller;


import com.corhuila.electivaii.Entity.Cliente;

import com.corhuila.electivaii.IService.IClienteService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class ClienteController extends ABaseController<Cliente, IClienteService> {
    public ClienteController(IClienteService service) {
        super(service, "Cliente");
}}
