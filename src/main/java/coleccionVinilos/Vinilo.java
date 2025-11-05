package coleccionVinilos;

public class Vinilo {
    private String artista;
    private String disco;
    private String anio;

    public Vinilo(String artista, String disco, String anio) {
        this.artista = artista;
        this.disco = disco;
        this.anio = anio;
    }

    public String getArtista() {
        return artista;
    }

    public String getDisco() {
        return disco;
    }

    public String getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Artista: " + artista + " | Disco: " + disco + " | Año: " + anio;
    }
}
