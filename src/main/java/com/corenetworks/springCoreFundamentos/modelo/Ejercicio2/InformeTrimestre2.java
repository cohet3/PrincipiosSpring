package com.corenetworks.springCoreFundamentos.modelo.Ejercicio2;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre2  implements Iinforme{
    @Override
    public String getInforme() {
        return "Este trimestre es el informe del Trimestre 2";
    }
}
