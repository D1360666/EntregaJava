package sofkau.Entregas;

import java.util.Scanner;

public class Ej12 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 12
     */

    public static void main(String[] args) {
        //TODO Falta hacer la diferencia entre las frases
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase1 = sc.nextLine();

        System.out.println("Ingrese otra frase: ");
        String frase2 = sc.nextLine();

        if(frase1.equalsIgnoreCase(frase2)){
            System.out.println("Las frases son iguales: ");
        }else{
            for(int i =0; i< frase1.length(); i++){

            }

        }

    }
}
