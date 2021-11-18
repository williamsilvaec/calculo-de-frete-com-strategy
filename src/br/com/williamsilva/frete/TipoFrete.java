package br.com.williamsilva.frete;

public enum TipoFrete {

    PAC(new PAC()), SEDEX(new SEDEX());

    private final CalculoFrete tipoCalculo;

    TipoFrete(CalculoFrete calculoFrete) {
        this.tipoCalculo = calculoFrete;
    }

    public CalculoFrete getTipoCalculo() {
        return tipoCalculo;
    }
}
