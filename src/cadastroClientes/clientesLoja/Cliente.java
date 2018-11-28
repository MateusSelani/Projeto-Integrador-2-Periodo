package cadastroClientes.clientesLoja;

public class Cliente extends ClasseAbstrataClienteLoja {

    public Cliente() {
        super();
    }

    public Cliente(String nomeCliente, String cpfCliente, String cepCliente,
                   String ufCliente) {

        super(nomeCliente, cpfCliente, cepCliente, ufCliente);
    }
}
