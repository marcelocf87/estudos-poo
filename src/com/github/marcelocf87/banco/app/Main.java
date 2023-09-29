/*

@author Marcelo Custódio Freitas
@version 1.0
@since 25/02/2023

*/

//Estudos sobre Orientação a objetos, classes e objetos, métodos e construtores, sobrecarga
//encapsulamento, JavaBeans e pacotes

package com.github.marcelocf87.banco.app;

import com.github.marcelocf87.banco.modelo.Conta;
import com.github.marcelocf87.banco.modelo.ContaEspecial;
import com.github.marcelocf87.banco.modelo.ContaInvestimento;
import com.github.marcelocf87.banco.modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Marcelo Custódio Freitas");
        titular1.setDocumento("123456");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Ana Carolina Cruz");
        titular2.setDocumento("654321");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 345, 654, 1_000);

//        minhaConta.depositar(30_000);
//        minhaConta.sacar(10_000);
//        minhaConta.creditarRendimentos(10);

        suaConta.depositar(15_000);
        minhaConta.sacar(15_5000);


//
//        System.out.println("Titular: " + minhaConta.getTitular().getNome());
//        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
     }
}
