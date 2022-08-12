package MesaAula6;

public class SerieProxy implements ISerie{
    private String nome;
    private int qtdeViews;

    public SerieProxy(String nome) {
        this.nome = nome;
        this.qtdeViews = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getqtdeViews() {
        return qtdeViews;
    }

    public void setqtdeViews(int qtdeViews) {
        this.qtdeViews = qtdeViews;
    }


    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException{
        Serie serie = new Serie();
        serie.getSerie(nome);
        if (qtdeViews < 5) {
            return serie.getNome() + " no link " + serie.getSerie(nome);
        } else {
            throw  new SerieNaoHabilitadaException();
        }
    }

    public void assistir(){
        qtdeViews++;
    }
}
