package Bridge;

public class NavegadorChrome implements NavegadorImplementado {

	@Override
	public void abrirWebsite(Website site) {
		System.out.println("Abrindo o site " + site.getLink());
	}

}
