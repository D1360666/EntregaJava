package sofkau.Entregas;

import java.util.ArrayList;

public class Ej6 {
    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 6
     */

    public static void main(String[] args) {
        ArrayList listaPares = new ArrayList();
        ArrayList listaimPares = new ArrayList();

        for(int i=0; i<101; i++){
            if(i%2==0){
                listaPares.add(i);

            }else {
                listaimPares.add(i);
            }
        }
        System.out.println("Lista de números pares: " + listaPares);
        System.out.println("Lista de números impares: " + listaimPares);
    }
}
