public class ReceitaFederal {
    public String pagarFisico(double valorDocumento, double valorImposto, String cpf) {
        return new String("Pagar físico com documento " + valorDocumento + ", imposto " + valorImposto + " e CPF " + cpf);
    }

    public String pagarJuridico(double valorDocumento, double valorImposto, String cpf) {
        return new String("Pagar jurídico com documento " + valorDocumento + ", imposto " + valorImposto + " e CPF " + cpf);
    }
}
