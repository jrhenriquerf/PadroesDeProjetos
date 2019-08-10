public class PDFPrototype extends DocumentoPrototype {
	
	//Construtor protegido
	protected PDFPrototype(PDFPrototype pdfPrototype) {
		//c�pia de valores
        this.textoDocumento = pdfPrototype.getTextoDocumento();
    }
 
	//Construtor p�blico para a primeira cria��o e defini��o de valor padr�o
    public PDFPrototype() {
        textoDocumento = "";
    }
	
	@Override
	public String exibirTexto() {
		return "Texto do PDF: " + getTextoDocumento();
	}

	@Override
	public DocumentoPrototype clonar() {
		return new PDFPrototype(this);
	}

}
