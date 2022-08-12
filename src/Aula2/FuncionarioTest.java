package Aula2;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {
    @Test
    void calculos(){
        Funcionario funcionario = new Efetivo("issao", "takeuchi","123", 10000,1,5000);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("issao", "takeuchi","1234", 1000,40);
        funcionario.pagamentoSalario();
    }
}
