package sofkau.Entregas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej14 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 14
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un nro: ");
        int nro = sc.nextInt();

        int aux = nro;
       while(aux<1000){
            aux = aux+2;
            System.out.println(aux);
        }

    }
}

