package modelo.cliente;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + super.toString() + ", cpf=" + cpf + '}';
    }
    
    
}
