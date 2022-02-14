package sofkau.Entregas.Ej17;

import java.util.ArrayList;
import java.util.List;


public class Principal {

    public static void main(String[] args) {
        List<Electrodomestico> lista = new ArrayList<>();

        lista.add(new Electrodomestico(50 , "negro", 'A', 50));
        lista.add(new Electrodomestico(80, "rojo", 'B', 120));
        lista.add(new Electrodomestico(50 , "negro", 'B', 50));
        lista.add(new Electrodomestico(50 , "negro", 'A', 50));

        lista.add(new Television(150, "rojo", 'C', 150, 60,true));
        lista.add(new Television(150, "rojo", 'C', 150, 60,true));
        lista.add(new Television(150, "rojo", 'C', 150, 60,true));
        lista.add(new Lavadora(5000, "verde", 'E', 200, 10));
        lista.add(new Lavadora(5000, "verde", 'E', 200, 10));

        int i = 0;
        double totElect=0;
        double totTV=0;
        double totLav=0;

        /**
         * CALCULANDO PRECIOS TOTALES
         */
        for(Electrodomestico e: lista){
            if(lista.get(i) instanceof Electrodomestico){
                totElect= totElect + lista.get(i).precioFinal(lista.get(i).getConsumo_energetico(), lista.get(i).getPeso());
            }
            if(lista.get(i) instanceof Television){
                totTV= totTV + lista.get(i).precioFinal(lista.get(i).getConsumo_energetico(), lista.get(i).getPeso());
            }
            if(lista.get(i) instanceof  Lavadora){

                totLav= totLav + lista.get(i).precioFinal(lista.get(i).getConsumo_energetico(), lista.get(i).getPeso());
            }
            i++;
        }

        //Mostrando precios totales por tipo de electrodomestico

        System.out.println("Precio total de Lavadoras: $"+totLav);
        System.out.println("Precio total de Television: $"+totTV);
        System.out.println("Precio total de Electrodomesticos: $"+totElect);

    }






}
