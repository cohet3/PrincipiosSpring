package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tm")
@Data
public class TallerMecanico implements ITaller {

    @Override
    public String reparar(Coche c) {
        return "El coche se esta reparando  "+c.getMatricula()+ " modelo  "+ c.getModelo()+
                "el coche ya se reparo";
    }
}
