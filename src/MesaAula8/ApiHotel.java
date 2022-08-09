package MesaAula8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiHotel {

    public List<ServicosTurismo> buscador(LocalDate dataEntrada, LocalDate dataSaida, String cidade, ListaServicos listaServicos){
        List<ServicosTurismo> servicosPesquisa = new ArrayList<>();
        for (ServicosTurismo servicosTurismo: listaServicos.getServicos()){
            if (dataEntrada.isAfter(servicosTurismo.getDataDisponibilidadeInicioCadastrado()) && dataSaida.isBefore(servicosTurismo.getDataDisponibilidadeFimCadastrado()) && cidade.equalsIgnoreCase(servicosTurismo.getCidadeCadastradoServico()) && servicosTurismo.getCategoria().equalsIgnoreCase("HOTEL")){
                servicosPesquisa.add(servicosTurismo);
            }
        }
        return servicosPesquisa;
    }
}
