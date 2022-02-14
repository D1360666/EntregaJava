package sofkau.Entregas;

import java.util.Locale;
import java.util.Scanner;

public class Ej8 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 8
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana: ");
        String dia = sc.next().toLowerCase();



        switch(dia){
            case "lunes":
                System.out.println("Es día laboral.");
                break;
            case "martes":
                System.out.println("Es día laboral.");
                break;
            case "miercoles":
                System.out.println("Es día laboral.");
                break;
            case "jueves":
                System.out.println("Es día laboral.");
                break;
            case "viernes":
                System.out.println("Es día laboral.");
                break;
            case "sabado":
                System.out.println("Es día no laboral.");
                break;
            case "domingo":
                System.out.println("Es día no laboral.");
                break;
            default:
                System.out.println("Día incorrecto.");
        }

    }
}
