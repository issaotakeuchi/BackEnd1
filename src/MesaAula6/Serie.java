package MesaAula6;

public class Serie implements ISerie{
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String getSerie(String nome) {
        return "www."+getNome()+".com";
    }
}
