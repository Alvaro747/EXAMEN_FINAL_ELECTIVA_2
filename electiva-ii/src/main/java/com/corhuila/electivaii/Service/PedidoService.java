package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Pedido;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.IRepository.IPedidoRepository;
import com.corhuila.electivaii.IRepository.IPersonRepository;
import com.corhuila.electivaii.IService.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;


public class PedidoService extends ABaseService<Pedido> implements IPedidoService {

    @Override
    protected IBaseRepository<Pedido, Long> getRepository() {
        return repository;
    }

    @Autowired
    private IPedidoRepository repository;
}
