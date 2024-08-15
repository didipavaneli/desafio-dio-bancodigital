package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Adriano de Souza");
        Conta cc1 = new ContaCorrente(c1);
        Conta poupanca1 = new ContaPoupanca(c1);
        cc1.depositar(500);
        cc1.transferir(100, poupanca1);
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        Cliente c2 = new Cliente("Jessica de Souza");
        Conta cc2 = new ContaCorrente(c2);
        Conta poupanca2 = new ContaPoupanca(c2);
        cc2.depositar(500);
        cc2.transferir(100, poupanca2);
        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();


        List<Conta> contas = new ArrayList<>();
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }



    }
    }

