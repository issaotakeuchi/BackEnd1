package Aula4;

public class GerenciadorGerencia extends Gerenciador{
    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) || (eMail.getAssunto().equalsIgnoreCase("gerencia"))){
            System.out.println("enviando ao departamento gerencial");
        } else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
