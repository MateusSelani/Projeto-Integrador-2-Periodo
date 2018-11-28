package cadastroClientes.clientesLoja;

public abstract class ClasseAbstrataClienteLoja {

    String nomeCliente;
    String cpfCliente;
    String cepCliente;
    String ufCliente;


    public ClasseAbstrataClienteLoja() {
    }

    public ClasseAbstrataClienteLoja(String nomeCliente, String cpfCliente, String cepCliente,
                                     String ufCliente) {

        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.cepCliente = cepCliente;
        this.ufCliente = ufCliente;

    }
}
