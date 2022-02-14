package sofkau.Entregas;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

/***
 * @Author Diego Gonzalez
 * El siguiente ejercicio cumple con lo solicitado en el ejercicio 13
 */
public class Ej13 {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/DD HH:MM:SS");

        System.out.println("FORMATO YYYY/MM/DD HH:MM:SS -> "+ dtf.format(LocalDateTime.now()));
    }
}
