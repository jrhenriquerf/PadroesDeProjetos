public abstract class DocumentoPrototype {
	protected String textoDocumento;
	
	public abstract String exibirTexto();
	
	public abstract DocumentoPrototype clonar();
	
	public void setTextoDocumento(String textoDocumento) {
		this.textoDocumento = textoDocumento;
	}
	
	public String getTextoDocumento() {
		return textoDocumento;
	}
}
