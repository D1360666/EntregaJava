package sofkau.Entregas;

import java.util.Scanner;

/***
 * @Author Diego Gonzalez
 * El siguiente ejercicio cumple con lo solicitado en el ejercicio 1 y 2
 */

public class Ej1y2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nro: ");
        int nroA = sc.nextInt();
        System.out.println("Ingrese otro nro: ");

        int nroB = sc.nextInt();

        if(nroA == nroB){
            System.out.println("El valor de ambos nros es igual: A=" + nroA + " y B=" + nroB );
        }else if(nroA > nroB){
            System.out.println("El valor de A es mayor que A: " + nroA);
        }else{
            System.out.println("El valor de B es mayor que A: " + nroB);
        }
    }



}
