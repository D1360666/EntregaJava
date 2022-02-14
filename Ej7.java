package sofkau.Entregas;

import java.util.Scanner;

public class Ej7 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 7
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.println("Ingrese un número:");
            numero = sc.nextInt();
        }
        while(numero<0);

    }
}
