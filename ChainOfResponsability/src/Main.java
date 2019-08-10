public class Main {
    public static void main(String args[]) {
        JogadoresChain poker = new Jogador1();
        poker.setNext(new Jogador2());
        poker.setNext(new Jogador3());
        poker.setNext(new Jogador4());
        poker.setNext(new Jogador5());
        poker.setNext(new Jogador6());

        try {
            poker.distribuirCartas(IDJogadores.jogador1);
            poker.distribuirCartas(IDJogadores.jogador2);
            poker.distribuirCartas(IDJogadores.jogador3);
            poker.distribuirCartas(IDJogadores.jogador4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
