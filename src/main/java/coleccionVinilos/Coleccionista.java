package coleccionVinilos;


public class Coleccionista extends Persona {
    private ColeccionVinilos coleccion;

    public Coleccionista(String nombre, int edad) {
        super(nombre, edad);
        this.coleccion = new ColeccionVinilos();
    }

    public ColeccionVinilos getColeccion() {
        return coleccion;
    }

    public void agregarVinilo(String artista, String disco, String anio) {
        coleccion.agregarVinilo(artista, disco, anio);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coleccionista: " + nombre + " (" + edad + " años)");
        coleccion.mostrarColeccion();
    }
}
