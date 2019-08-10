package Builder;

public class PadraoSimplesBuilder extends CasaBuilder {
	
	@Override
	public void buildPreco() {
		casa.preco = 150000.00;
	}

	@Override
	public void buildConstrutora() {
		casa.construtora = "RC7";
	}

	@Override
	public void buildTipoPiso() {
		casa.tipoPiso = "Cer�micas";
	}

	@Override
	public void buildQtdBanheiros() {
		casa.qtdBanheiros = 1;
	}

	@Override
	public void buildChurrasqueira() {
		casa.churrasqueira = false;
	}
	
}
