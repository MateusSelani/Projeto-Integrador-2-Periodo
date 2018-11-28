package cadastroClientes.clientesLoja.enderecoCliente;

import java.util.ArrayList;

public class EnderecoCliente {

    // CAPTURA CIDADE E LOGRADOURO DO CLIENTE

    String cidadeCliente;
    String logradouroCliente;
    String bairroCliente;

    // CAPTURA BAIRRO, DDI, TELEFONE E DDD DO CLIENTE
    String DDICliente;
    String telefoneCliente;
    String DDDCliente;

    public Object capturaCidadeLogradouro(String cidadeCliente, String logradouroCliente) {

        ArrayList<String> listaCidadeLogradouro = new ArrayList<String>();

        listaCidadeLogradouro.add(this.cidadeCliente = cidadeCliente);
        listaCidadeLogradouro.add(this.logradouroCliente = logradouroCliente);

        return listaCidadeLogradouro;
    }

    public Object capturaBairroDDITelefoneDDD(String bairroCliente, String DDICliente,
                                              String telefoneCliente, String DDDCliente) {

        ArrayList<String> listaBairroDDITelefoneDDD = new ArrayList<String>();

        listaBairroDDITelefoneDDD.add(this.bairroCliente = bairroCliente);
        listaBairroDDITelefoneDDD.add(this.DDICliente = DDICliente);
        listaBairroDDITelefoneDDD.add(this.telefoneCliente = telefoneCliente);
        listaBairroDDITelefoneDDD.add(this.DDDCliente = DDDCliente);

        return listaBairroDDITelefoneDDD;
    }

}
