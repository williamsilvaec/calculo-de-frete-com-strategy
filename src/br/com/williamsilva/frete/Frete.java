package br.com.williamsilva.frete;

import java.math.BigDecimal;

public class Frete {

    private final TipoFrete tipoFrete;

    public Frete(TipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public BigDecimal calcular(BigDecimal distancia) {
        return tipoFrete.getTipoCalculo().calcular(distancia);
    }
}
