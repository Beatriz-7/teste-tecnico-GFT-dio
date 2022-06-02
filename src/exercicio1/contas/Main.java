package exercicio1.contas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente Beatriz = new Cliente();
        Beatriz.setNome("Beatriz");

        Cliente Lorena = new Cliente();
        Lorena.setNome("Lorena");

        Conta cc = new ContaCorrente(Beatriz);
        Conta poupanca = new ContaPoupanca(Beatriz);

        ContaCorrente c1 = new ContaCorrente(Lorena);
        ContaPoupanca poupanca1  = new ContaPoupanca(Lorena);


        cc.depositar(700);
        cc.transferir(347, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        c1.depositar(100);
        c1.transferir(50,poupanca1);

        c1.imprimirExtrato();
        poupanca1.imprimirExtrato();


        poupanca.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca1.simulacaoDeRendimento(poupanca.getSaldo());



    }
}


