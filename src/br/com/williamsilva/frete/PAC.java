package br.com.williamsilva.frete;

import java.math.BigDecimal;

public class PAC implements CalculoFrete {

    @Override
    public BigDecimal calcular(BigDecimal distancia) {
        return distancia.multiply(new BigDecimal("1.25")).add(BigDecimal.ZERO);
    }
}
