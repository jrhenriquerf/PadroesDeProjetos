public class Main {

    public static void main(String[] args) {
        Pessoa homem = new Homem("Jair");
        Pessoa mulher = new Mulher("Karis");
        Pessoa filho = new Homem("Jairzinho");

        try {
            homem.adicionarFilho(filho);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            mulher.adicionarFilho(filho);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Filhos da mulher: " + mulher.verificarFilhos());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Filhos do homem: " + homem.verificarFilhos());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
