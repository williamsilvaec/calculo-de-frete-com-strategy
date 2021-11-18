package br.com.williamsilva.frete;

import java.math.BigDecimal;

public class SEDEX implements CalculoFrete {

    @Override
    public BigDecimal calcular(BigDecimal distancia) {
        return distancia.multiply(new BigDecimal("1.45")).add(new BigDecimal("12"));
    }
}
