package sofkau.Entregas.Ej17;

import java.util.Locale;

public class Electrodomestico {
    private double precio_base;
    private String color;
    private char consumo_energetico;
    private double peso;

    //Constructores-------------------------

    //Por defecto
    public Electrodomestico() {
        this.precio_base = 100;
        this.color = "blanco";
        this.consumo_energetico = 'F';
        this.peso = 5;
    }

    //Pasando precio y peso
    public Electrodomestico(double precio, double peso) {
        this.precio_base = precio;
        this.color = "blanco";
        this.consumo_energetico = 'F';
        this.peso = peso;
    }
    //Pasando todos los parámetros
    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    /**
     * SETTERS Y GETTERS
     */
    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**************************************
     * FUNCIONES
     **************************************/

    /** FUNCIÓN PARA COMPROBAR EL CONSUMO ENERGETICO
     * @param letra
     * @return char
     */
    private char comprobarConsumoEnergetico(char letra){
        if(letra=='A' || letra=='B' || letra=='C' || letra=='D'|| letra=='E'){
            return letra;
        }
        return 'F';
    }

    /**
     * FUNCION PARA COMPROBAR EL COLOR INGRESADO
     * @param color
     * @return
     */
    private String comprobarColor(String color){
        String ingresado = color.toLowerCase();
        if(ingresado.equals("negro") || ingresado.equals("rojo") || ingresado.equals("azul") || ingresado.equals("gris")){
            return ingresado;
        }else{
            return "Blanco";
        }
    }

    /**
     * FUNCION precioFinal
     * @param letra
     * @param peso
     * @return
     */

    public double precioFinal(char letra, double peso){
        double precioFinal=0;
        double precioLetra =0;
        double precioPeso =0;

        switch (letra){
            case 'A':
                precioLetra=100;
                break;
            case 'B':
                precioLetra=80;
                break;
            case 'C':
                precioLetra=60;
                break;
            case 'D':
                precioLetra=50;
                break;
            case 'E':
                precioLetra=30;
                break;
            default :
                precioLetra=10;
                break;
        }
        if(peso<20){
            precioPeso = 10;
        }else if(peso>19 && peso<50) {
            precioPeso = 50;
        }else if(peso>49 && peso<80){
            precioPeso=80;
        }else{
            precioPeso=100;
        }

        precioFinal=this.precio_base + precioLetra + precioPeso;

        return precioFinal;
    }



}
