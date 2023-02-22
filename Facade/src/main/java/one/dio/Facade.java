package one.dio;

import one.dio.subsistema.cep.CepApi;
import one.dio.subsistema.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade,estado);
    }
}