package Aula4;

public class GerenciadorComercial extends Gerenciador{
    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) || (eMail.getAssunto().equalsIgnoreCase("comercial"))){
            System.out.println("enviando ao departamento comercial");
        } else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
