package com.target.sistemas.prova;

public class QuestaoN4 {
    public static void main(String[] args){
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double faturamentoTotalDistribuidora = 438172.0;

        double percSP = (faturamentoSP / faturamentoTotalDistribuidora) * 100;
        double percRJ = (faturamentoRJ / faturamentoTotalDistribuidora) * 100;
        double percMG = (faturamentoMG / faturamentoTotalDistribuidora) * 100;
        double percES = (faturamentoES / faturamentoTotalDistribuidora) * 100;
        double percOutros = (faturamentoOutros / faturamentoTotalDistribuidora) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percSP);
        System.out.printf("RJ: %.2f%%\n", percRJ);
        System.out.printf("MG: %.2f%%\n", percMG);
        System.out.printf("ES: %.2f%%\n", percES);
        System.out.printf("Outros: %.2f%%\n", percOutros);
    }
}
