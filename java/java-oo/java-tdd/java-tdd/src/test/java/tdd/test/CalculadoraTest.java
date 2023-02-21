package tdd.test;
import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void somarNumerosPossitivos(){
        Calculadora calculadora = new Calculadora();
        Integer result = calculadora.somar(2,2);

       Assertions.assertEquals(4, result);
    }
}
