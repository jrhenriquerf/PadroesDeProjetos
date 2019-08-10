public class ReceitaFederalProxy extends ReceitaFederal {
    protected String usuario, senha;

    ReceitaFederalProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String pagarFisico(double valorDocumento, double valorImposto, String cpf) {
        if(temPermissaoDeAcessoFisico()){
            return super.pagarFisico(valorDocumento, valorImposto, cpf);
        }
        return null;
    }

    @Override
    public String pagarJuridico(double valorDocumento, double valorImposto, String cpf) {
        if(temPermissaoDeAcessoJuridico()){
            return super.pagarJuridico(valorDocumento, valorImposto, cpf);
        }
        return null;
    }

    private boolean temPermissaoDeAcessoFisico() {
        return usuario == "admin" && senha == "admin";
    }

    private boolean temPermissaoDeAcessoJuridico() {
        return usuario == "admin" && senha == "admin";
    }
}
