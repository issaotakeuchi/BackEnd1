package MesaAula8;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FacadeBuscador implements IFacadeBsucador{
    private ApiHotel apiHotel;
    private ApiVoo apiVoo;

    public FacadeBuscador() {
        this.apiHotel = new ApiHotel();
        this.apiVoo = new ApiVoo();
    }


    @Override
    public List<ServicosTurismo> buscador(String cidade, LocalDate dataInicio, LocalDate dataFim, ListaServicos listaServicos) {
        List<ServicosTurismo> listaServicosResultado = new ArrayList<>();
        listaServicosResultado.addAll(apiHotel.buscador(dataInicio, dataFim, cidade, listaServicos));
        listaServicosResultado.addAll(apiVoo.buscador(dataInicio,dataFim,cidade,listaServicos));
        return listaServicosResultado;
    }
}
