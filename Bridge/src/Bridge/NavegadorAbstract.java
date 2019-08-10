package Bridge;

public abstract class NavegadorAbstract {
	protected NavegadorImplementado navegador;
	
	public NavegadorAbstract(NavegadorImplementado navegadorImp) {
		navegador = navegadorImp;
	}
	
	public void abriWebsite(Website site) {
		navegador.abrirWebsite(site);
	}
	
	public abstract void navegar();
}
