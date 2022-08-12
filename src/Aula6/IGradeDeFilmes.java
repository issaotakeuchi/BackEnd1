package Aula6;

public interface IGradeDeFilmes {
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}
