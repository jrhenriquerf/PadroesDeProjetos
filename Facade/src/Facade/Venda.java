package Facade;

public class Venda {
    private Contabilidade contabilidade;
    private Correios correios;
    private Logistica logistica;
    private Transportadora transportadora;
    private Qualidade qualidade;

    Venda() {
        this.contabilidade = new Contabilidade();
        this.correios = new Correios();
        this.logistica = new Logistica();
        this.transportadora = new Transportadora();
        this.qualidade = new Qualidade();
    }

    public void comprar() {
        contabilidade.pagar();
        qualidade.validar();
        logistica.embrulhar();
        transportadora.movimentar();
        correios.entregar();
    }
}
