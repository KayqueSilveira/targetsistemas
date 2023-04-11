package com.target.sistemas.prova.fibonacci;

public class Fibonacci {

        public boolean quadradoPerfeito(int x) {
            int s = (int) Math.sqrt(x);
            return (s * s == x);
        }

        public boolean isFibonacci (int n ){
            return quadradoPerfeito(5 * n * n + 4) || quadradoPerfeito(5 * n * n - 4);
        }
}