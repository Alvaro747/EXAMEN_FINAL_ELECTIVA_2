package com.corhuila.electivaii.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends ABaseEntity {

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @Column(name = "direccion", nullable = false)
    private String direccion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
