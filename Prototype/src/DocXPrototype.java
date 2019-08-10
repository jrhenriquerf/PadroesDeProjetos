public class DocXPrototype extends DocumentoPrototype {

	//Construtor protegido
	protected DocXPrototype(DocXPrototype pdfPrototype) {
		//c�pia de valores
        this.textoDocumento = pdfPrototype.getTextoDocumento();
    }
 
	//Construtor p�blico para a primeira cria��o e defini��o de valor padr�o
    public DocXPrototype() {
        textoDocumento = "";
    }
	
	@Override
	public String exibirTexto() {
		return "Texto do DocX: " + getTextoDocumento();
	}

	@Override
	public DocumentoPrototype clonar() {
		return new DocXPrototype(this);
	}

}
