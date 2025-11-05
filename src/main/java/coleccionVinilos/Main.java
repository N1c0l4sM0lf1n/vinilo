package coleccionVinilos;

public class Main {
    public static void main(String[] args) {
        ColeccionVinilos coleccion = new ColeccionVinilos();

        coleccion.agregarVinilo("Iron Maiden", "Iron Maiden", "1980");
        coleccion.agregarVinilo("Iron Maiden", "Killers", "1981");
        coleccion.agregarVinilo("Iron Maiden", "The number of the beast", "1982");
        coleccion.agregarVinilo("AC-DC", "Back in black", "1980");
        coleccion.agregarVinilo("AC-DC", "Highway to Hell", "1979");
        coleccion.agregarVinilo("AC-DC", "Who made who", "1986");
        coleccion.agregarVinilo("Judas Priest", "British Steel", "1980");
        coleccion.agregarVinilo("Judas Priest", "Painkiller", "1990");
        coleccion.agregarVinilo("Judas Priest", "Defenders of the faith", "1984");
        coleccion.agregarVinilo("Kiss", "Destroyer", "1976");

        System.out.println("Espacio máximo colección: 100");
        System.out.println("Total vinilos: " + coleccion.totalVinilos());
        System.out.println("Espacios disponibles: " + coleccion.espaciosDisponibles());
        System.out.println();

        String artista = "AC-DC";
        coleccion.mostrarBusquedaPorArtista(artista);

        System.out.println();
        coleccion.mostrarColeccion();
    }
}
