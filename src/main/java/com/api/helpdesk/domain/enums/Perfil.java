package com.api.helpdesk.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(0, "ROLE_CLIENTE"),
    TECNICO(0, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    public static Perfil toEnum(Integer cod){
        if (cod.equals(null)){
            return null;
        }

        for(Perfil p : Perfil.values()){
            if(cod.equals(p.codigo)){
                return p;
            }
        }

        throw new IllegalArgumentException("O perfil informado é inválido");

    }
}
