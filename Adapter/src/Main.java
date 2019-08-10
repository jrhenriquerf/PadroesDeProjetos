public class Main {

	public static void main(String[] args) {
		TomadaDoisPinos tomadaDoisPinos = new TomadaDoisPinos();
		AdapterTomada adapter = new AdapterTomada(tomadaDoisPinos);
		adapter.conectarTomadaTresPinos();
	}

}
