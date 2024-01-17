package com.corenetworks.springCoreFundamentos.modelo.Ejercicio2;

import com.corenetworks.springCoreFundamentos.modelo.Coche;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component


public class InformeTrimestre1 implements Iinforme{

    @Override
    public String getInforme() {
        return "Este trimestre es el informe del Trimestre 1";
    }
}
