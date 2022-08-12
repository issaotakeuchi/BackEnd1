package Aula4;

public class GerenciadorSpam extends Gerenciador{
    @Override
    public void verificar(Mail eMail){
        System.out.println("marcado como spam");
    }
}
