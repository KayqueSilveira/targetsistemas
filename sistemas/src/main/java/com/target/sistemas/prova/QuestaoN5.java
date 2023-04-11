package com.target.sistemas.prova;

import java.util.Scanner;

public class QuestaoN5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite uma string:");
            String original = input.nextLine();

            String invertida = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                invertida += original.charAt(i);
            }

            System.out.println("String invertida: " + invertida);
        }


}
