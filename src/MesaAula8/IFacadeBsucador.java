package MesaAula8;

import java.time.LocalDate;
import java.util.List;

public interface IFacadeBsucador {
    public List<ServicosTurismo> buscador(String cidade, LocalDate dataInicio, LocalDate dataFim, ListaServicos listaServicos);
}
