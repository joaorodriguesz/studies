package tdd.test;
import org.example.Calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void somarNumerosPossitivos(){
        Calculadora calculadora = new Calculadora();
        Integer result = calculadora.somar(2,2);

       assertEquals(4, result);
    }
}
