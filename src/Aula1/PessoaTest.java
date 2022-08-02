package Aula1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("issao", "takeuchi", LocalDate.of(1989,03,01));
        p2 = new Pessoa("isa", "takeuchi", LocalDate.of(1989,03,01));
        p3 = new Pessoa("marina", "takeuchi", LocalDate.of(1989,03,01));
        p4 = new Pessoa("mari", "takeuchi", LocalDate.of(1989,03,01));
        p5 = new Pessoa("robson", "takeuchi", LocalDate.of(1989,03,01));
        p6 = new Pessoa("fernanda", "takeuchi", LocalDate.of(1989,03,01));
        p7 = new Pessoa("danielle", "takeuchi", LocalDate.of(2010,03,01));
        p8 = new Pessoa("fernanda", "takeuchi", LocalDate.of(2010,03,01));
        p9 = new Pessoa("marcelo", "takeuchi", LocalDate.of(2010,03,01));
        p10 = new Pessoa("thelma", "takeuchi", LocalDate.of(2010,03,01));
    }

    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);
    }

}
