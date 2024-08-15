package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}