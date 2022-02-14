package sofkau.Entregas;

import java.util.Scanner;

public class Ej4 {
        /***
         * @Author Diego Gonzalez
         * El siguiente ejercicio cumple con lo solicitado en el ejercicio 4
         */

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el precio del árticulo");
            Double precio = sc.nextDouble();
            int iva = 21;
            Double pFinal = precio + (precio * 21)/100;

            System.out.println("El precio final del articulo es: " + pFinal);
    }
}
