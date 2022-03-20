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
            if (String.valueOf(numeros.charAt(1)).equals(",") || String.valueOf(numeros.charAt(1)).equals("\n")){
                lista = numeros.split("[,|\n]");
                int suma = 0;
                for (String elemento:lista) {
                    suma += Integer.parseInt(elemento);
                }
                return suma;
                }
            if (!String.valueOf(numeros.charAt(1)).equals("[0-9]") & !String.valueOf(numeros.charAt(3)).equals("[0-9]")){
                lista = numeros.split("[!|\"|#|$|%|&|'|(|)|*|+|\\|-|.|/|:|;|=|>|?|@|[|]|^|_|`|{|\n}|[A-Z][a-z]]");
                int suma = 0;
                for (String elemento:lista) {
                    suma += Integer.parseInt(elemento);
                }
                return suma;
            }
            if (Integer.parseInt(numeros) < 0)
                throw new Exception("Los numeros negativos no aplican");
            if (Integer.parseInt(numeros) > 1000)
                throw new Exception("Los valores > a Mil no aplican");

            return 0;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
