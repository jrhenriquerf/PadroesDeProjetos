public class Main {
    public static void main (String args[]) {
        System.out.println("Hacker acessando");
        ReceitaFederal rfHacker = new ReceitaFederalProxy("hacker", "321521");
        System.out.println(rfHacker.pagarFisico(10000, 213, "45661110839"));
        System.out.println(rfHacker.pagarJuridico(12313, 421, "42212332152"));

        System.out.println("\nAdministrador acessando");
        ReceitaFederal rfAdmin = new ReceitaFederalProxy("admin", "admin");
        System.out.println(rfAdmin.pagarFisico(10000, 213, "45661110839"));
        System.out.println(rfAdmin.pagarJuridico(12313, 421, "42212332152"));
    }
}
