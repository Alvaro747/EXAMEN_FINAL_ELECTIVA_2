package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido extends ABaseEntity {

    @Column(name = "detalle", length = 50, nullable = false)
    private String detalle;

    @Column(name = "estado_pedido", length = 50, nullable = false)
    private String estadoPedido;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @Column(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
}
