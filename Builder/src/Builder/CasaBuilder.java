package Builder;

public abstract class CasaBuilder {
	protected Casa casa;
	
	public CasaBuilder() {
		casa = new Casa();
	}
	
	public abstract void buildPreco();
	public abstract void buildConstrutora();
	public abstract void buildTipoPiso();
	public abstract void buildQtdBanheiros();
	public abstract void buildChurrasqueira();
	
	public Casa getCasa() {
		return casa;
	}
}
