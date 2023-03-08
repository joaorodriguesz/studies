package tdd.service.test;

import org.example.modelo.Desempenho;
import org.example.modelo.Funcionario;
import org.example.modelo.service.ReajusteService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
     @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForAdesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("joao", LocalDate.now(), new BigDecimal("1000.00"));
        service.corcederReajuste(funcionario, Desempenho.A_DESEJAR);

         assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
     }
}
