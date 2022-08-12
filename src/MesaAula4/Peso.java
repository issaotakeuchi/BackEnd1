package MesaAula4;

public class Peso extends ControleQualidade{
    @Override
    public void verificar(Produto produto) {
        if (produto.getPeso() >= 1200 && produto.getPeso() <= 1300){
            System.out.println("peso correto. enviado para o controle de embalagem");
            this.getSequinte().verificar(produto);
        } else {
            System.out.println("peso errado");
        }
    }
}
