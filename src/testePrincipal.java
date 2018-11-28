import cadastroClientes.CadastrarCliente;
import clientesLoja.Cliente;

public class testePrincipal {
    public static void main(String[] args) {

        Cliente cliente;
        cliente = new Cliente("teste", "teste", "teste", "teste");

        CadastrarCliente cadastrarCliente;
        cadastrarCliente = new CadastrarCliente(cliente);

        cliente.getClass();
        cadastrarCliente.getClass();


    }
}
