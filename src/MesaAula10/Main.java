package MesaAula10;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();


        MediaValores mediaValores = new MediaValores();
        mediaValores.addInteiro(10);
        mediaValores.addInteiro(5);
        mediaValores.addInteiro(5);
        mediaValores.addInteiro(5);
        mediaValores.addInteiro(5);

        mediaValores.mediaValorMinEValorMax();

        try {
            mediaValores.tamanhoDaLista();
        }catch (Exception e){
            logger.error("a lista tem menos que 5 itens");
        }

    }

}
