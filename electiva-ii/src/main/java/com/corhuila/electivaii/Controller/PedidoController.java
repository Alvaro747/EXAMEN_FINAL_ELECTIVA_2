package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Pedido;
import com.corhuila.electivaii.Entity.Person;
import com.corhuila.electivaii.IService.IPedidoService;
import com.corhuila.electivaii.IService.IPersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pedido")
public class PedidoController  extends ABaseController<Pedido, IPedidoService> {
    public PedidoController(IPedidoService service) {
        super(service, "Pedido");
    }
}
