package MesaAula8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class FacadeBuscadorTest {
    private FacadeBuscador facadeBuscador = new FacadeBuscador();
    private Hotel hotel;
    private Hotel hotel2;
    private Voo voo;

    private List<Hotel> listaHotelEsperado;
    private List<Voo> listaVooEsperado;
    private ListaServicos listaServicos;
    private List<ServicosTurismo> listaEsperada;

    @BeforeEach
    void doBefore(){
        hotel = new Hotel(LocalDate.of(2022,1,1),LocalDate.of(2022,12,31),"Sao Paulo","HOTEL","Palacio Tangara","deluxe");
        hotel2 = new Hotel(LocalDate.of(2020,1,1),LocalDate.of(2022,12,31),"Sao Paulo", "HOTEL","Rosewood","deluxe");
        voo = new Voo(LocalDate.of(2022,6,1),LocalDate.of(2023,12,31),"Sao Paulo","VOO","Miami","LATAM","business","LA1234");
        listaHotelEsperado = new ArrayList<>();
        listaVooEsperado = new ArrayList<>();
        listaServicos = new ListaServicos();
        listaEsperada = new ArrayList<>();
    }
    @Test
    void validarBuscaTest(){
        listaServicos.addServico(hotel);
        listaServicos.addServico(hotel2);
        listaServicos.addServico(voo);
        listaHotelEsperado.add(hotel);
        listaHotelEsperado.add(hotel2);
        List<ServicosTurismo> resultado = facadeBuscador.buscador("Sao Paulo", LocalDate.of(2022,3,15), LocalDate.of(2022,4,15),listaServicos);
        Assertions.assertEquals(listaHotelEsperado,resultado);
    }
    @Test
    void validarBuscaTest2(){
        listaServicos.addServico(hotel);
        listaServicos.addServico(hotel2);
        listaServicos.addServico(voo);
        listaHotelEsperado.add(hotel2);
        List<ServicosTurismo> resultado = facadeBuscador.buscador("Sao Paulo", LocalDate.of(2021,3,15), LocalDate.of(2022,4,15),listaServicos);
        Assertions.assertEquals(listaHotelEsperado,resultado);
    }

    @Test
    void validarBuscaTest3(){
        listaServicos.addServico(hotel);
        listaServicos.addServico(hotel2);
        listaServicos.addServico(voo);
        listaVooEsperado.add(voo);
        List<ServicosTurismo> resultado = facadeBuscador.buscador("Sao Paulo", LocalDate.of(2023,3,15), LocalDate.of(2023,4,15),listaServicos);
        Assertions.assertEquals(listaVooEsperado ,resultado);
    }

    @Test
    void validarBuscaTest4(){
        listaServicos.addServico(hotel);
        listaServicos.addServico(hotel2);
        listaServicos.addServico(voo);
        listaEsperada.add(hotel);
        listaEsperada.add(hotel2);
        listaEsperada.add(voo);
        List<ServicosTurismo> resultado = facadeBuscador.buscador("Sao Paulo", LocalDate.of(2022,7,15), LocalDate.of(2022,7,20),listaServicos);
        Assertions.assertEquals(listaEsperada ,resultado);
    }
}
