package MesaAula8;

import java.time.LocalDate;

public class Hotel extends ServicosTurismo{
    private String nome;
    private String categoriaQuarto;

    public Hotel(LocalDate dataDisponibilidadeInicioCadastrado, LocalDate dataDisponibilidadeFimCadastrado, String cidadeCadastradoServico, String categoria, String nome, String categoriaQuarto) {
        super(dataDisponibilidadeInicioCadastrado, dataDisponibilidadeFimCadastrado, cidadeCadastradoServico, categoria);
        this.nome = nome;
        this.categoriaQuarto = categoriaQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoriaQuarto() {
        return categoriaQuarto;
    }

    public void setCategoriaQuarto(String categoriaQuarto) {
        this.categoriaQuarto = categoriaQuarto;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", categoriaQuarto='" + categoriaQuarto + '\'' +
                '}';
    }
}
