package sofkau.Entregas.Ej18;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();
        List<VideoJuego> videojuegos = new ArrayList<>();

        series.add(new Serie("Lost", "Misterio", "PP", 10));
        series.add(new Serie("The Strain", "Terror", "PP", 4));
        series.add(new Serie("LCDP", "Acción", "PP", 5));
        series.add(new Serie("Outcast", "Terror", "PP", 10));
        series.add(new Serie("Vis a Vis", "Accion", "PP", 4));

        videojuegos.add(new VideoJuego("COD4", "Shot", "Activision", 50));
        videojuegos.add(new VideoJuego("MK9", "Pelea", "Midway", 10));
        videojuegos.add(new VideoJuego("Mario Brs ", "Aventura", "Nintendo", 24));
        videojuegos.add(new VideoJuego("Fifa", "Sports", "EA", 200));
        videojuegos.add(new VideoJuego("PES2022", "Sports", "Konami", 100));


        series.get(1).entregar();
        series.get(3).entregar();
        series.get(4).entregar();

        //RESUMEN
        System.out.println("Series entregadas: "+SeriesEntregadas(series));
        System.out.println("Videojuegos entregados: "+VideojuegosEntregados(videojuegos));
        System.out.println("Serie con más temporadas:");
        System.out.println(getSerieConMasTemporadas(series).toString());
        System.out.println("Videojuego con más horas estimadas:");
        System.out.println(getVideoJuegoConMasHorasEstimadas(videojuegos).toString());
    }

    public static int SeriesEntregadas(List<Serie> series){
        int cont=0;
        for(int i=0;i<series.size();i++){
            if(series.get(i).isEntregado()){
                cont++;
            }
        }
        return cont;
    }

    public static int VideojuegosEntregados(List<VideoJuego> juegos){
        int cont=0;
        for(int i=0;i<juegos.size();i++){
            if(juegos.get(i).isEntregado()){
                cont++;
            }
        }
        return cont;
    }
    public static Serie getSerieConMasTemporadas(List<Serie> series){
        Serie sAux = series.get(0);
        for(int i=0;i<series.size();i++){
            if(series.get(i).compareTo(sAux)==1){
                sAux=series.get(i);
            }
        }
        return  sAux;
    }
    public static VideoJuego getVideoJuegoConMasHorasEstimadas(List<VideoJuego> juegos){
        VideoJuego vAux = juegos.get(0);
        for(int i=0;i<juegos.size();i++){
            if(juegos.get(i).compareTo(vAux)==1){
                vAux=juegos.get(i);
            }
        }
        return vAux;
    }
}
