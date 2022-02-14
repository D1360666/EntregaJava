package sofkau.Entregas;

import java.util.Scanner;

public class Ej10 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 10
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        frase.trim();
        System.out.println("Frase sin espacios: " + frase.replace(" ", ""));
    }
}
