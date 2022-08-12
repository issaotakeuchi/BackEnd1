package Aula6;

public class GradeDeFilmes implements IGradeDeFilmes{
    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = null;

        switch (nomeDoFilme) {
            case "karate kid":
                f = new Filme("karate kid", "ARG", "www.krtk.com");
                break;
            case "karate kid II":
                f = new Filme("karate kid II", "COL", "www.krtkii.com");
                break;
            case "avengers":
                f = new Filme("avengers", "BRA", "www.avengers.com");
                break;
            case "harry potter":
                f = new Filme("harry potter", "BRA", "www.hp.com");
                break;
        }
        return f;
    }
}
