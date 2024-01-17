package com.corenetworks.springCoreFundamentos.modelo.Ejercicio2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Secretario implements IEmpleado {

    private String empresa;
    private String email;
    @Autowired
    private Iinforme i;

    @Override
    public String getInforme() {
        return i.getInforme();
    }

    @Override
    public String getTareas() {
        return "Lleva el registro de las reuniones";
    }
}
