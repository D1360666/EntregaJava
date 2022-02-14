package sofkau.Entregas.Ej18;

public class Serie {
    private String titulo = "";
    private String genero = "";
    private String creador = "";
    private int nroTemporadas = 3;
    private boolean entregado = false;

    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.nroTemporadas = numeroTemporadas;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getNumeroTemporadas() {
        return nroTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.nroTemporadas = numeroTemporadas;
    }

    public String toString() {
        String objeto = new String("");
        objeto += "titulo: " + this.titulo + ", ";
        objeto += "genero: " + this.genero + ", ";
        objeto += "creador: " + this.creador + ", ";
        objeto += "numeroTemporadas: " + this.nroTemporadas + ", ";
        objeto += "entregado: " + this.entregado + ", ";
        return objeto;
    }


    public void entregar() {
        this.entregado = true;
    }

    public boolean isEntregado() {
        if (this.entregado) {
            return true;
        }
        return false;
    }

    public int compareTo(Object a) {
        Serie serie = (Serie) a;
        if (this.nroTemporadas > serie.getNumeroTemporadas()) {
            return 1;
        } else if (this.nroTemporadas == serie.getNumeroTemporadas()) {
            return 0;
        }
        return -1;
    }
}