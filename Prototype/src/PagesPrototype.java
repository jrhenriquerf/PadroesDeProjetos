public class PagesPrototype extends DocumentoPrototype {
	//Construtor protegido
	protected PagesPrototype(PagesPrototype pdfPrototype) {
		//c�pia de valores
        this.textoDocumento = pdfPrototype.getTextoDocumento();
    }
 
	//Construtor p�blico para a primeira cria��o e defini��o de valor padr�o
    public PagesPrototype() {
        textoDocumento = "";
    }
	
	@Override
	public String exibirTexto() {
		return "Texto do Pages: " + getTextoDocumento();
	}

	@Override
	public DocumentoPrototype clonar() {
		return new PagesPrototype(this);
	}
}
