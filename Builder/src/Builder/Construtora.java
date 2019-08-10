package Builder;

public class Construtora {
	protected CasaBuilder construtora;
	
	public Construtora(CasaBuilder construtora) {
		this.construtora = construtora;
	}
	
	public void construirCasa() {
		construtora.buildPreco();
		construtora.buildConstrutora();
		construtora.buildTipoPiso();
		construtora.buildQtdBanheiros();
		construtora.buildChurrasqueira();
	}
	
	public Casa getCasa() {
		return construtora.getCasa();
	}
}
