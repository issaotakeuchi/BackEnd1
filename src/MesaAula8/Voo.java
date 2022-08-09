package MesaAula8;

import java.time.LocalDate;

public class Voo extends ServicosTurismo{
    private String cidadeOrigem;
    private String ciaAerea;
    private String classe;
    private String voo;

    public Voo(LocalDate dataDisponibilidadeInicioCadastrado, LocalDate dataDisponibilidadeFimCadastrado, String cidadeCadastradoServico, String categoria, String cidadeOrigem, String ciaAerea, String classe, String voo) {
        super(dataDisponibilidadeInicioCadastrado, dataDisponibilidadeFimCadastrado, cidadeCadastradoServico, categoria);
        this.cidadeOrigem = cidadeOrigem;
        this.ciaAerea = ciaAerea;
        this.classe = classe;
        this.voo = voo;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "cidadeOrigem='" + cidadeOrigem + '\'' +
                ", ciaAerea='" + ciaAerea + '\'' +
                ", classe='" + classe + '\'' +
                ", voo='" + voo + '\'' +
                '}';
    }
}
