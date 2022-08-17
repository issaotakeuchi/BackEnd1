package Aula14;

//import org.junit.FixMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.runners.MethodSorters;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MedicamentoServiceTest {
    MedicamentoService medicamentoService;

    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void guardarMedicamento(){
        Medicamento medicamento = new Medicamento("ibuprofeno", "ache",395,23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId()!=null);

        System.out.println("ID do medicamento: " + medicamento.getId());

        Medicamento medicamento1 = new Medicamento("dorflex", "sanofi",550,26.50);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId()!=null);

        System.out.println("ID do medicamento: " + medicamento1.getId());
    }

}
