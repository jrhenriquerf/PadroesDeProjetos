public class AdapterTomada extends TomadaTresPinos {
	private TomadaDoisPinos tomadaDoisPinos;
	
	public AdapterTomada(TomadaDoisPinos tomadaDoisPinos) {
		this.tomadaDoisPinos = tomadaDoisPinos;
	}
	
	//Sobreescrita do m�todo conectarTomadaTresPinos chamando m�todo da classe TomadaTresPinos.
	@Override
	public void conectarTomadaTresPinos() {
		tomadaDoisPinos.conectarTomadaDoisPinos();
	}
}
