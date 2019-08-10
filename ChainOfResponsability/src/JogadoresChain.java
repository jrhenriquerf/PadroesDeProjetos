public abstract class JogadoresChain {
    protected JogadoresChain next;
    protected IDJogadores identificadorDoJogador;

    JogadoresChain(IDJogadores jogador) {
        this.next = null;
        this.identificadorDoJogador = jogador;
    }

    public void setNext(JogadoresChain jogador) {
        if(next == null)
            next = jogador;
        else
            next.setNext(jogador);
    }

    public void distribuirCartas(IDJogadores id) throws Exception {
        if(podeDistribuirCarta(id))
            distribuiCarta();
        else {
            if (this.next == null)
                throw new Exception("Jogador não encontrado!");
            next.distribuirCartas(id);
        }
    }

    public boolean podeDistribuirCarta(IDJogadores id) {
        return this.identificadorDoJogador == id;
    }

    protected abstract void distribuiCarta();
}
