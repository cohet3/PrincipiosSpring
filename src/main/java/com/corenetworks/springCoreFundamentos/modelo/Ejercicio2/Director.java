package com.corenetworks.springCoreFundamentos.modelo.Ejercicio2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Director implements IEmpleado {
    @Autowired
    private Iinforme i;

    @Override
    public String getInforme() {
        return i.getInforme();
    }

    @Override
    public String getTareas() {
        return "el director marca el rumbo de la empresa";
    }
}
