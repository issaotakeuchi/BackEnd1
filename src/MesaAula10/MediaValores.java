package MesaAula10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class MediaValores {
    private static final Logger logger = Logger.getLogger(MediaValores.class);
    private List<Integer> listaInteiros;

    public MediaValores() {
        listaInteiros = new ArrayList<>();
    }

    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void setListaInteiros(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    public void addInteiro(int numeroInteiro){
        listaInteiros.add(numeroInteiro);
    }

    public void tamanhoDaLista(){
        if (listaInteiros.size() >= 5 && listaInteiros.size() <= 10){
            logger.info("o comprimento da lista e maior que 5");
        } else if (listaInteiros.size() > 10){
            logger.info("o comprimento da lista e maior que 10");
        }

    }
    public void mediaValorMinEValorMax(){
        OptionalDouble media = listaInteiros.stream().mapToInt(a -> a).average();
        Integer max = Integer.MIN_VALUE;
        for (Integer i: listaInteiros){
            if (max<i){
                max = i;
            }
        }

        Integer min = Integer.MAX_VALUE;
        for (Integer i: listaInteiros){
            if (min>i){
                min = i;
            }
        }
        System.out.println("valor minimo: " + min + " valor maximo: " + max + " média: " + media);

    }



}
