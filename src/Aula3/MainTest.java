package Aula3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    Funcionario func1, func2;
    Afiliado af1, af2, af3;

    @BeforeEach
    public void doBefore(){
        func1 = new Funcionario("Issao", 2);
        func1.vender(2);

        func2 = new Funcionario("Marina", 2);
        func2.vender(10);

        af1 = new Afiliado("Robson");
        af1.vender(2);

        af2 = new Afiliado("Hamilton");
        af2.vender(4);

        af3 = new Afiliado("Tom");

        func1.adicionarAfiliado(af1);
        func1.adicionarAfiliado(af2);
    }

    @Test
    public void mostrarVendedores(){
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(af1.mostrarCategoria());
        System.out.println(af2.mostrarCategoria());
        System.out.println(af3.mostrarCategoria());
    }


}

