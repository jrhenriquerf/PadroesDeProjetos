package Builder;

public class Main {

	public static void main(String[] args) {
		Construtora construtoraSimples = new Construtora(new PadraoSimplesBuilder());	 
		construtoraSimples.construirCasa();
	    Casa casaSimples = construtoraSimples.getCasa();
	    System.out.println(casaSimples);
	 
	    System.out.println();
	 
	    Construtora construtoraMedio = new Construtora(new PadraoMedioBuilder());	 
	    construtoraMedio.construirCasa();
	    Casa casaMedia = construtoraMedio.getCasa();
	    System.out.println(casaMedia);
	}

}
