package org.example;

public class Converter {

    static int valor ;
    static Double valorDouble = Double.valueOf(valor);

    public static void digitarValores(int valor) {
        System.out.println("O valor em int é: " + valor +" e o valor em double é: " + valorDouble);
    }


}

