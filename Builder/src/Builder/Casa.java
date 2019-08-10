package Builder;

public class Casa {
	double preco;
	String construtora;
	String tipoPiso;
	int qtdBanheiros;
	boolean churrasqueira;
	
	@Override
	public String toString() {
		return "Builder.Casa [preco=" + preco + ", construtora=" + construtora + ", tipoPiso=" + tipoPiso + ", qtdBanheiros="
				+ qtdBanheiros + ", churrasqueira=" + churrasqueira + "]";
	}
}
