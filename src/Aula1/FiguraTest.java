package Aula1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraTest {

    @Test
    void testeCirculo(){
        Circulo c1 = new Circulo(5);
        Assertions.assertEquals(2 * Math.PI * 5, c1.calcularPerimetro());
    }

    @Test
    void testeQuadrado(){
        Quadrado q1 = new Quadrado(10);
        Assertions.assertEquals(4*10, q1.calcularPerimetro());
    }

}
