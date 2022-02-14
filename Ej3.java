package sofkau.Entregas;

import java.util.Scanner;

public class Ej3 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 3
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo:");
        Double radio = sc.nextDouble();

        Double area = Math.pow(radio, 2) * Math.PI;

        System.out.println("El área del circulo con radio: " + radio + " es: " + area);

    }
}
