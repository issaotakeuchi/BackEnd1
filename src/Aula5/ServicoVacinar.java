package Aula5;

import java.time.LocalDate;
import java.util.Date;

public class ServicoVacinar implements Vacinar{
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        System.out.println("usuario " + rg + " vacinado em " + dataVacina + " com sucesso");
    }
}
