package MesaAula4;

import Aula4.CheckMail;
import Aula4.Mail;

public class ProcessoProduto {
    public static void main(String[] args) {
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Produto("arroz",1500,1250,"saudável"));
        processo.verificar(new Produto("macarrao",4500,1250,"saudável"));
        processo.verificar(new Produto("feijao",1500,5250,"saudável"));

    }
}
