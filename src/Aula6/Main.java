package Aula6;

public class Main {
    public static void main(String[] args) {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(20,23,25,25));

        try {
            System.out.println(proxy.getFilme("karate kid").getLink());
            System.out.println("acesso do filme liberado");
        }
        catch (FilmeNaoHabilitadoException e){
            System.out.println(e);
        }
    }
}
