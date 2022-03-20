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
    @DisplayName("Test para validar cuando la cadena tiene tres numeros separados por cualquier caracter")
    void testCadenaOtrosCaracteres()throws Exception{
        assertEquals(calculator.stringCalculator("2h2#2"), 6);
    }

    @Test
    @DisplayName("Test para validar cuando la cadena recibe numeros negativos")
    void testCadenaNumerosNegativos(){
        Exception thrown = assertThrows(Exception.class, () ->
                calculator.stringCalculator("-1"));
        assertEquals("Los numeros negativos no aplican", thrown.getMessage());
    }

    @Test
    @DisplayName("Test para validar cuando la cadena recibe numeros mayores a 1000")
    void testCadenaNumeroMayorAMil(){
        Exception thrown = assertThrows(Exception.class, () ->
                calculator.stringCalculator("2000"));
        assertEquals("Los valores > a Mil no aplican", thrown.getMessage());
    }
}