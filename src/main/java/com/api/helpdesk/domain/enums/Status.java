package com.api.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(0, "ANDAMENTO"),
    ENCERRADO(0, "ENCERRADO");

    private Integer codigo;
    private String descricao;

    public static Status toEnum(Integer cod){
        if (cod==null){
            return null;
        }
        
        for(Status p : Status.values()){
            if(cod.equals(p.codigo)){
                return p;
            }
        }

        throw new IllegalArgumentException("O status é inválido");

    }
}
