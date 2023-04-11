package com.target.sistemas.prova;

public class QuestaoN3 {
        public static void main(String[] args) {
            double[] faturamentos = {22174.16, 24537.66, 26139.61, 0, 0, 26742.66, 0,
                    42889.22, 46251.17, 11191.47, 0, 0, 3847.48, 373.78, 2659.75,
                    48924.24, 18419.26, 0, 0, 35240.18, 43829.16, 18235.68, 4355.06,
                    13327.1, 0, 0, 25681.83, 1718.12, 13220.49, 8414.61};

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = 0;
            double somaFaturamentoMensal = 0;
            double mediaMensal = 0;
            int diaSuperior = 0;
            int count = 0;

            for (int i = 0; i < faturamentos.length; i++) {
                if (faturamentos[i] < menorFaturamento && faturamentos[i] > 0) {
                    menorFaturamento = faturamentos[i];
                }
                if(faturamentos[i] > maiorFaturamento){
                    maiorFaturamento = faturamentos[i];
                }
                if(faturamentos[i] > 0){
                    count++;
                    somaFaturamentoMensal += faturamentos[i];
                }

            }
            mediaMensal = somaFaturamentoMensal/count;
            for (int i = 0; i < faturamentos.length; i++) {
                if(faturamentos[i] > mediaMensal) {
                    diaSuperior++;
                }
            }

            System.out.println("Faturamento total do mês: R$" + somaFaturamentoMensal );
            System.out.println("O menor faturamento ocorrido em um dia do mês foi de: R$" + menorFaturamento);
            System.out.println("O maior faturamento ocorrido em um dia do mês foi de: R$" + maiorFaturamento);
            System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diaSuperior);
        }

}
