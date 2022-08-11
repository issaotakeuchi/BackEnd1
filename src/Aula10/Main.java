package Aula10;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{
        //alternativa para configurar o log4j.properties
        BasicConfigurator.configure();
        Leao simba = new Leao("simba", 8,true);
        simba.correr();
        simba.eMaiorQue10();
        try {
            simba.eMaiorQue10();
        } catch (Exception e){
            logger.error("a idade do leao " + simba.getNome() + " esta incorreta", e);
        }
    }

}
