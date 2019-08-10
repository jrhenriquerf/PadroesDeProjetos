package Builder;

public class PadraoMedioBuilder extends CasaBuilder {

	@Override
	public void buildPreco() {
		casa.preco = 400000.00;
	}

	@Override
	public void buildConstrutora() {
		casa.construtora = "Din�mica";
	}

	@Override
	public void buildTipoPiso() {
		casa.tipoPiso = "Porcelanato";
	}

	@Override
	public void buildQtdBanheiros() {
		casa.qtdBanheiros = 2;
	}

	@Override
	public void buildChurrasqueira() {
		casa.churrasqueira = true;
	}
	
}
