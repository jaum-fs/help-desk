package com.api.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(0, "MÉDIA"),
    ALTA(0, "ALTA");

    private Integer codigo;
    private String descricao;

    public static Prioridade toEnum(Integer cod){
        if (cod==null){
            return null;
        }
        
        for(Prioridade p : Prioridade.values()){
            if(cod.equals(p.codigo)){
                return p;
            }
        }

        throw new IllegalArgumentException("Prioridade nválida");

    }
}
