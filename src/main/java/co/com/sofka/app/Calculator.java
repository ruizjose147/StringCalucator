package co.com.sofka.app;

import java.util.Arrays;

public class Calculator {

    private String separador = null;
    private String[] lista = null;
    public int stringCalculator(String numeros)throws Exception {

        try {
            if (numeros.length() == 0)
                return 0;
            if (numeros.length() == 1)
                return Integer.parseInt(numeros);
            if (String.valueOf(numeros.charAt(1)).equals(",") || String.valueOf(numeros.charAt(1)).equals("\n")
            || String.valueOf(numeros.charAt(1)).equals("*")) {
                lista = numeros.split("[,|\n|*]");
                int suma = 0;
                for (String elemento:lista) {
                    suma += Integer.parseInt(elemento);
                }
                return suma;
                }

            return 0;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
