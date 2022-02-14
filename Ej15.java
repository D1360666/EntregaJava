package sofkau.Entregas;

import java.util.Scanner;

public class Ej15 {

    /***
     * @Author Diego Gonzalez
     * El siguiente ejercicio cumple con lo solicitado en el ejercicio 15
     */

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while(opcion!=8){
            menu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3: System.out.println("Opcion 3");
                    break;
                case 4: System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Opcion 5");
                    break;
                case 6:
                    System.out.println("Opcion 6");
                    break;
                case 7:
                    System.out.println("Opcion 7");
                    break;
                default: System.out.println("Opción incorrecta");
                break;
            }
        }
        System.out.println("Salliendo del sistema");
        System.exit(0);

    }

    public static void menu(){
        System.out.println("" +
                "Bienvenido, Seleccione la opción que " +
                "****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }
}
