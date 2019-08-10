import java.util.ArrayList;

public abstract class Pessoa {
    String nomeDaPessoa;

    public void printNomePessoa() {
        System.out.println(this.nomeDaPessoa);
    }

    public String getNomeDaPessoa() {
        return this.nomeDaPessoa;
    }

    public void adicionarFilho(Pessoa filho) throws Exception {
        throw new Exception("Não pode ter filhos!");
    }

    public ArrayList<Pessoa> verificarFilhos() throws Exception {
        throw new Exception("Não possui filhos!");
    }
}
