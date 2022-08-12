package Aula5;

import java.time.LocalDate;
import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())){
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg,dataVacina,tipoVacina);
            System.out.println("cidadao vacinado com sucesso");
        } else {
            System.out.println("a data de hoje é anterior a data marcada");
        }
    }
}
