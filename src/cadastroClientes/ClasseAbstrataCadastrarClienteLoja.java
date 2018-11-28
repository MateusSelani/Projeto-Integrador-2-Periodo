package cadastroClientes;

public abstract class ClasseAbstrataCadastrarClienteLoja implements InterfaceCadastroCliente {

    Object cliente;

    ClasseAbstrataCadastrarClienteLoja() {
    }

    ClasseAbstrataCadastrarClienteLoja(Object cliente) {
        this.cliente = cliente;
    }
}
