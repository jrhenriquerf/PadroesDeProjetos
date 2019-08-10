public class Main {

	public static void main(String[] args) {
		DocumentoPrototype prototipoPdf = new PDFPrototype();
		 
		DocumentoPrototype pdfAntigo = prototipoPdf.clonar();
		pdfAntigo.setTextoDocumento("Texto do arquivo PDF");
	    // utiliza��o do objeto anterior para gerar novo objeto
	    DocumentoPrototype pdfNovo = prototipoPdf.clonar();
	    pdfNovo.setTextoDocumento("Texto do arquivo PDF novo");
	 
	    System.out.println(pdfAntigo.exibirTexto());
	    System.out.println(pdfNovo.exibirTexto());
	    
	    
	    DocumentoPrototype prototipoDocX = new DocXPrototype();
		 
		DocumentoPrototype docXAntigo = prototipoDocX.clonar();
		docXAntigo.setTextoDocumento("Texto do arquivo DocX");
	    // utiliza��o do objeto anterior para gerar novo objeto
	    DocumentoPrototype docXNovo = prototipoDocX.clonar();
	    docXNovo.setTextoDocumento("Texto do arquivo DocX novo");
	 
	    System.out.println(docXAntigo.exibirTexto());
	    System.out.println(docXNovo.exibirTexto());
	    
	    
	    DocumentoPrototype prototipoPages = new PagesPrototype();
		 
		DocumentoPrototype pagesAntigo = prototipoPages.clonar();
		pagesAntigo.setTextoDocumento("Texto do arquivo Pages");
	    // utiliza��o do objeto anterior para gerar novo objeto
	    DocumentoPrototype pagesNovo = prototipoPages.clonar();
	    pagesNovo.setTextoDocumento("Texto do arquivo Pages novo");
	 
	    System.out.println(pagesAntigo.exibirTexto());
	    System.out.println(pagesNovo.exibirTexto());
	}

}
