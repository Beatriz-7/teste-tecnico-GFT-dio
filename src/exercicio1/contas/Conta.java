package exercicio1.contas;

import java.util.Scanner;

public abstract class Conta extends iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void simulacaoDeRendimento(double saldo) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int meses;
        double taxaDeJuros = 0.05;
        double montante = saldo;
        System.out.println("Quantos meses deseja que seja realizado a simulação?");
        meses = sc.nextInt();
        while (count < meses){
            montante *= (1+taxaDeJuros);
            count++;
        }
        if (meses == 1)
            System.out.printf("Após 1 mês você terá R$ "+"%.2f%n", montante);
        else
            System.out.printf("Após "+meses+" meses você terá R$ "+"%.2f%n", montante);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d%n", this.agencia));
        System.out.println(String.format("Numero: %d%n", this.numero));
        System.out.println(String.format("Saldo: %.2f%n", this.saldo));
    }

    public void depositar(int i, ContaPoupanca poupanca1) {
    }

}
