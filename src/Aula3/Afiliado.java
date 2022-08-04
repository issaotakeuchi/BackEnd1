package Aula3;

import java.time.LocalDate;

public class Afiliado extends Vendedor{
    public Afiliado(String nome){
        super.nome = nome;
        super.pontosPorVenda = 15;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * pontosPorVenda;
    }
}
