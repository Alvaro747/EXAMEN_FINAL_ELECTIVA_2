package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Cliente;
import com.corhuila.electivaii.Entity.Pedido;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IRepository.IClienteRepository;
import com.corhuila.electivaii.IRepository.IPedidoRepository;
import com.corhuila.electivaii.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;


public class ClienteService extends ABaseService<Cliente> implements IClienteService {

    @Override
    protected IBaseRepository<Cliente, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IClienteRepository repository;
}
