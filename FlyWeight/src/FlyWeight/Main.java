package FlyWeight;

public class Main {

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        System.out.println(servidor.getArquivo("Arquivo1"));
        System.out.println(servidor.getArquivo("Arquivo2"));
        System.out.println(servidor.getArquivo("Arquivo3"));
    }
}
