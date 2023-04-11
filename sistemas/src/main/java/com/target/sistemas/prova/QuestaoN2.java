package com.target.sistemas.prova;

import com.target.sistemas.prova.fibonacci.Fibonacci;

import java.util.Scanner;

public class QuestaoN2 {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        int numeroFibo = sc1.nextInt();

        Fibonacci execercicio2 = new Fibonacci();

        if(execercicio2.isFibonacci(numeroFibo) == true){
            System.out.println("O numero " + numeroFibo + " é fibonacci");
        }else {
            System.out.println("O numero " + numeroFibo + " não é fibonacci");
        }

    }
}
