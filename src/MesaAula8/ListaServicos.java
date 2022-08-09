package MesaAula8;

import java.util.ArrayList;
import java.util.List;

public class ListaServicos {
    List<ServicosTurismo> servicos;
    public ListaServicos() {this.servicos = new ArrayList<>(); }

    public List<ServicosTurismo> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicosTurismo> servicos) {
        this.servicos = servicos;
    }

    public void  addServico(ServicosTurismo servicosTurismo) { servicos.add(servicosTurismo); }
}
