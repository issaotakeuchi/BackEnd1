package Aula8;

public class ApiProduto {
    public int desconto(Produto produto){
        if (produto.getTipo().compareTo("lata")==0){
            return 10;
        }else{
            return 0;
        }
    }
}
