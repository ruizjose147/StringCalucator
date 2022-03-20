package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test para validar cuando la cadena esta vacia")
    void testCadenaVacia() throws Exception{
        assertEquals(calculator.stringCalculator(""), 0);
    }

    @Test
    @DisplayName("Test para validar cuando la cadena es de un solo numero")
    void testCadenaMonoElemento()throws Exception{
        assertEquals(calculator.stringCalculator("2"), 2);
    }

    @Test
    @DisplayName("Test para validar cuando la cadena esta separada por comas")
    void testCadenaPorComas()throws Exception{
        assertEquals(calculator.stringCalculator("2,2"), 4);
    }

    @Test
    @DisplayName("Test para validar cuando la cadena esta separada por saltos de linea")
    void testCadenaPorSaltosDeLinea()throws Exception{
        assertEquals(calculator.stringCalculator("2\n2"), 4);
    }

    @Test
    @DisplayName("Test para validar cuando la cadena esta separada por saltos de linea")
    void testCadenaCualquierVaina()throws Exception{
        assertEquals(calculator.stringCalculator("2h2"), 4);
    }
}