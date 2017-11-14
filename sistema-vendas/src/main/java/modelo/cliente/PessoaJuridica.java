package modelo.cliente;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + super.toString() + ", cnpj=" + cnpj + '}';
    }

    
    
}
