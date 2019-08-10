import java.util.ArrayList;

public class Mulher extends Pessoa {
    ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();

    Mulher (String nomeDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
    }

    @Override
    public void adicionarFilho(Pessoa filho) {
        this.filhos.add(filho);
    }

    @Override
    public ArrayList<Pessoa> verificarFilhos() throws Exception {
        return filhos;
    }
}
