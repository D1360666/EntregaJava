package sofkau.Entregas;

import java.util.Scanner;

public class Ej9 {
    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 9
     */

    public static void main(String[] args) {
        String cadena ="“La sonrisa sera la mejor arma contra la tristeza”";

        System.out.println("Frase original: \n"  + cadena);

        String cadenaModificada= cadena.replace("a", "e");
        System.out.println("Frase con la A reemplazado por E: \n"  + cadenaModificada);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String miFrase = sc.nextLine();

        System.out.println("Frase concatenada: " + cadenaModificada + " " + miFrase);
    }
}
