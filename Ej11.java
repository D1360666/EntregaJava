package sofkau.Entregas;

import java.util.Scanner;

public class Ej11 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 11
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        int vocales=0;
        char ch;
        for(int i = 0; i< frase.length(); i++){
            ch=frase.charAt(i);

            if(String.valueOf(ch).equals("a") || String.valueOf(ch).equals("e") || String.valueOf(ch).equals("i") || String.valueOf(ch).equals("o") || String.valueOf(ch).equals("u")){
                vocales++;
            }
        }
        System.out.println("Longitud de la frase ingresada: " + frase.length() + "\n" + "Cantidad de vocales encontradas en la frase: " + vocales);


    }
}
