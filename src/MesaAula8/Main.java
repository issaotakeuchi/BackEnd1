package MesaAula8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ListaServicos listaServicos = new ListaServicos();

        Hotel hotel1 = new Hotel(LocalDate.of(2021,1,1),LocalDate.of(2022,12,31),"Miami", "HOTEL","The Setai","deluxe");
        Hotel hotel2 = new Hotel(LocalDate.of(2021,1,1),LocalDate.of(2022,12,31),"Miami", "HOTEL","Four Seasons","deluxe");
        Hotel hotel3 = new Hotel(LocalDate.of(2024,1,1),LocalDate.of(2024,12,31),"Tokyo", "HOTEL","Mandarin Oriental","deluxe");

        Voo voo1 = new Voo(LocalDate.of(2022,4,1),LocalDate.of(2022,12,1),"Miami", "VOO","Sao Paulo", "American Airlines", "business", "aa1234");
        Voo voo2 = new Voo(LocalDate.of(2022,4,1),LocalDate.of(2022,12,1),"Miami","VOO","Sao Paulo", "American Airlines", "business", "aa1234");
        Voo voo3 = new Voo(LocalDate.of(2022,3,1),LocalDate.of(2022,12,1),"Miami","VOO","Sao Paulo", "American Airlines", "business", "aa1234");

        listaServicos.addServico(hotel1);
        listaServicos.addServico(hotel2);
        listaServicos.addServico(hotel3);
        listaServicos.addServico(voo1);
        listaServicos.addServico(voo2);
        listaServicos.addServico(voo3);

        FacadeBuscador facadeBuscador = new FacadeBuscador();

        System.out.println(facadeBuscador.buscador("Tokyo", LocalDate.of(2024,3,10),LocalDate.of(2024,3,20),listaServicos));

    }
}
