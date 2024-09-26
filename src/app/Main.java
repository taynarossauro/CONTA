package app;
import models.*;
/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */


public class Main {

    public static void main(String[] args) {
        //instanciando o objeto da classe conta
        Conta minhaConta = new Conta();

        //Fazendo um depósito
        minhaConta.depositar(100.0);
        System.out.println("Depósito realizado: R$100,00");

        //Consultando o saldo
        System.out.println(minhaConta.consultarSaldo());

        //Fazendo saque
        minhaConta.sacar(50.0);
        System.out.println("Saque realizado: R$50,00");

        //Consultando o saldo após o saque
        System.out.println(minhaConta.consultarSaldo());

        //Fazendo mais consultas para verificar a cobrança da taxa
        for (int i = 0; i < 4; i++) {
            System.out.println(minhaConta.consultarSaldo());
        }
    }
}
