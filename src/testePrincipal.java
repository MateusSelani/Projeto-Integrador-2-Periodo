import cadastroClientes.CadastrarCliente;
import cadastroClientes.clientesLoja.Cliente;
import cadastroClientes.clientesLoja.enderecoCliente.EnderecoCliente;

public class testePrincipal {
    public static void main(String[] args) {

        //       Cliente cliente;
        //      cliente = new Cliente("mateus", "2343", "42345", "GO");
//
//        CadastrarCliente cadastrarCliente;
        //      cadastrarCliente = new CadastrarCliente(cliente);

        //    cliente.getClass();
        //    cadastrarCliente.getClass();

        EnderecoCliente endereco = new EnderecoCliente();

        endereco.capturaCidadeLogradouro("Goiania", "rua 117");
        endereco.capturaBairroDDITelefoneDDD("universitario", "21", "12", "087");
    }
}
