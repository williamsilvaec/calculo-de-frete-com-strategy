package br.com.williamsilva;

import br.com.williamsilva.frete.Frete;
import br.com.williamsilva.frete.TipoFrete;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a distância: ");
        int distancia = entrada.nextInt();
        System.out.print("Qual do tipo de frete? (1) PAC, (2) SEDEX: ");
        int opcaoFrete = entrada.nextInt();
        TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

        Frete frete = new Frete(tipoFrete);
        BigDecimal precoDoFrete = frete.calcular(BigDecimal.valueOf(distancia));
        System.out.printf("O valor total é de R$ %.2f", precoDoFrete);

    }
}
