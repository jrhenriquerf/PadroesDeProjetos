package FlyWeight;

public class Arquivo {
    private String nome;
    private String caminho;

    Arquivo(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
    }

    public String getLocalizacao() {
        return this.caminho;
    }

    public String getNome() {
        return this.nome;
    }
}
