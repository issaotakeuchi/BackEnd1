package Aula3;

import java.time.LocalDate;

public abstract class Vendedor {
    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;


    public void vender(int qtdeVendas){
        this.vendas += qtdeVendas;
        System.out.println(this.nome + "realizou " + qtdeVendas + " vendas");
    }
    public abstract int calcularPontos();

    //template method
    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosVendedor + " pontos e ele é " + getNomeCategoria(pontosVendedor);
    }
    //fim template method

    private String getNomeCategoria(int pontosVendedor){
        if (pontosVendedor < 20) {
            return "NOVATO";
        } else if (pontosVendedor < 31 ) {
            return "APRENDIZ";
        } else if (pontosVendedor < 41) {
            return "BOM";
        } else {
            return "MESTRE";
        }
    }


}
