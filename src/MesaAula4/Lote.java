package MesaAula4;

public class Lote extends ControleQualidade{
    @Override
    public void verificar(Produto produto) {
        if (produto.getLote() >= 1000 && produto.getLote() <= 2000){
            System.out.println("lote correto. enviado para o controle de peso");
            this.getSequinte().verificar(produto);
        } else {
            System.out.println("lote errado");
        }
    }
}
