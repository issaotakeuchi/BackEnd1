package MesaAula8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiVoo {
        public List<ServicosTurismo> buscador(LocalDate dataPartida, LocalDate dataRetorno, /*String origem,*/ String destino, ListaServicos listaServicos){
        List<ServicosTurismo> servicosPesquisa = new ArrayList<>();
        for (ServicosTurismo servicosTurismo: listaServicos.getServicos()){
            if (dataPartida.isAfter(servicosTurismo.getDataDisponibilidadeInicioCadastrado()) && dataRetorno.isBefore(servicosTurismo.getDataDisponibilidadeFimCadastrado()) && destino.equalsIgnoreCase(servicosTurismo.getCidadeCadastradoServico()) /*&& origem.equalsIgnoreCase(voo.getCidadeOrigem())*/ && servicosTurismo.getCategoria().equalsIgnoreCase("VOO")){
                servicosPesquisa.add(servicosTurismo);
            }
        }
        return servicosPesquisa;
    }
}
