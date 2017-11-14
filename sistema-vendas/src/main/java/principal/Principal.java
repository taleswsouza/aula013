package principal;

import modelo.cliente.Cliente;
import modelo.cliente.PessoaFisica;
import modelo.cliente.PessoaJuridica;

public class Principal {
    public static void main(String[] args) {
        String nome = "Lula";
        String endereco = "..., RJ";
        String email = "lula@pt.com.br";
        String cpf = "1313131313-13";
        
        Cliente cliente = new PessoaFisica(nome, endereco, email, cpf);
        System.out.println("Cliente: " + cliente );

        cliente = new PessoaJuridica("Petrobras", "Recife", "contato@petrobras.com.br", "123123123-0001/2");
        System.out.println("Cliente: " + cliente );

    }
}
