package sofkau.Entregas;

import java.util.ArrayList;

public class Ej5 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 5
     */

    public static void main(String[] args) {
        ArrayList listaPares = new ArrayList();
        ArrayList listaimPares = new ArrayList();
        int numero=0;
        while (numero <= 100){
            if(numero%2==0){
                listaPares.add(numero);

            }else{
                listaimPares.add(numero);
            }
            numero++;
        }
        System.out.println("Lista de números pares: " + listaPares);
        System.out.println("Lista de números impares: " + listaimPares);
    }
}
