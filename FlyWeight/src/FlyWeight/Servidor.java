package FlyWeight;

import java.util.ArrayList;

public class Servidor {
    ArrayList<Arquivo> arquivos;

    public Servidor() {
        arquivos = new ArrayList<Arquivo>();
        arquivos.add(new Arquivo("Arquivo1", "/arquivos/exemplo/arquivo1"));
        arquivos.add(new Arquivo("Arquivo2", "/arquivos/exemplo/arquivo2"));
        arquivos.add(new Arquivo("Arquivo3", "/arquivos/exemplo/arquivo3"));
        arquivos.add(new Arquivo("Arquivo4", "/arquivos/exemplo/arquivo4"));
        arquivos.add(new Arquivo("Arquivo5", "/arquivos/exemplo/arquivo5"));
        arquivos.add(new Arquivo("Arquivo6", "/arquivos/exemplo/arquivo6"));
    }

    public String getArquivo(String nome) {
        for ( Arquivo arquivo : arquivos) {
            if(arquivo.getNome().equals(nome))
                return "Localização do arquivo " + arquivo.getNome() + ", " + arquivo.getLocalizacao();
        }
        return "FlyWeight.Arquivo não encontrado!";
    }
}
