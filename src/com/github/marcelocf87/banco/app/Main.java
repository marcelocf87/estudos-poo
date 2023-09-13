/*

@author Marcelo Custódio Freitas
@version 1.0
@since 25/02/2023

*/

//Estudos sobre Orientação a objetos, classes e objetos, métodos e construtores, sobrecarga
//encapsulamento, JavaBeans e pacotes

package com.github.marcelocf87.banco.app;

import com.github.marcelocf87.banco.modelo.Conta;
import com.github.marcelocf87.banco.modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Marcelo Custódio Freitas");
        titular1.setDocumento("123456");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Ana Carolina Cruz");
        titular2.setDocumento("654321");

        Conta minhaConta = new Conta(titular1, 123, 987);
//        minhaConta.setTitular(titular1);
//        minhaConta.setAgencia(1401);
//        minhaConta.setNumero(385255);
//        minhaConta.saldo = 20_000;


        Conta suaConta = new Conta(titular2, 345, 654);
//        suaConta.setTitular(titular2);
//        suaConta.setAgencia(1401);
//        suaConta.setNumero(385555);
//        suaConta.saldo = 50_000;

        minhaConta.depositar(30_000);
        suaConta.depositar(15_000);

        minhaConta.sacar(10_000, 10);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
     }
}
