package MesaAula7;

public class Arvore {
    private String nome;
    private int altura;
    private int largura;
    private String cor;

    public Arvore(String nome, int altura, int largura, String cor) {
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
