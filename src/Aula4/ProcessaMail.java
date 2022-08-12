package Aula4;

public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();

        processo.verificar(new Mail("email@email.com","tecnica@dh.com", "Reclamação"));
        processo.verificar(new Mail("email@email.com","tecnico@colmeia.com", "Reclamação"));
        processo.verificar(new Mail("email@email.com","gerencia@colmeia.com", "Reclamação"));
    }
}
