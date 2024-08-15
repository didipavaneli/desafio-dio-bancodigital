package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;


    public List<Conta> ImprimirContas() {
        List<Conta> contas = new ArrayList<Conta>();
        for (Conta conta : this.contas) {
            contas.add(conta);
        }
        return contas;
    }
}