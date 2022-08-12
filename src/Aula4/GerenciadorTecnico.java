package Aula4;

public class GerenciadorTecnico extends Gerenciador{
    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("tecnico@colmeia.com")) || (eMail.getAssunto().equalsIgnoreCase("tecnico"))){
            System.out.println("enviando ao departamento tecnico");
        } else {
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
