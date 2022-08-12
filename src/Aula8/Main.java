package Aula8;

public class Main {
    public static void main(String[] args) {
        FacadeDesconto facadeDesconto = new FacadeDesconto();
        Cartao cartao = new Cartao("123456789101", "Star Bank");
        Produto produto = new Produto("ervilha", "lata");

        System.out.println("desconto: " + facadeDesconto.desconto(cartao, produto,1));
    }
}
