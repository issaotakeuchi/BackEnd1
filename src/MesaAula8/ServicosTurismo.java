package MesaAula8;

import java.time.LocalDate;

public abstract class ServicosTurismo {
    private LocalDate dataDisponibilidadeInicioCadastrado;
    private LocalDate dataDisponibilidadeFimCadastrado;
    private String cidadeCadastradoServico;
    private String categoria;

    public ServicosTurismo(LocalDate dataDisponibilidadeInicioCadastrado, LocalDate dataDisponibilidadeFimCadastrado, String cidadeCadastradoServico, String categoria) {
        this.dataDisponibilidadeInicioCadastrado = dataDisponibilidadeInicioCadastrado;
        this.dataDisponibilidadeFimCadastrado = dataDisponibilidadeFimCadastrado;
        this.cidadeCadastradoServico = cidadeCadastradoServico;
        this.categoria = categoria;
    }

    public LocalDate getDataDisponibilidadeInicioCadastrado() {
        return dataDisponibilidadeInicioCadastrado;
    }

    public void setDataDisponibilidadeInicioCadastrado(LocalDate dataDisponibilidadeInicioCadastrado) {
        this.dataDisponibilidadeInicioCadastrado = dataDisponibilidadeInicioCadastrado;
    }

    public LocalDate getDataDisponibilidadeFimCadastrado() {
        return dataDisponibilidadeFimCadastrado;
    }

    public void setDataDisponibilidadeFimCadastrado(LocalDate dataDisponibilidadeFimCadastrado) {
        this.dataDisponibilidadeFimCadastrado = dataDisponibilidadeFimCadastrado;
    }

    public String getCidadeCadastradoServico() {
        return cidadeCadastradoServico;
    }

    public void setCidadeCadastradoServico(String cidadeCadastradoServico) {
        this.cidadeCadastradoServico = cidadeCadastradoServico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}



