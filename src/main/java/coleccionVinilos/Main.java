package coleccionVinilos;

public class Main {
    public static void main(String[] args) {

        Coleccionista coleccionista = new Coleccionista("Pepe", 35);
        coleccionista.agregarVinilo("Iron Maiden", "The Number of the Beast", "1982");
        coleccionista.agregarVinilo("AC-DC", "Highway to Hell", "1979");
        coleccionista.agregarVinilo("Kiss", "Destroyer", "1976");

        coleccionista.mostrarInfo();

        System.out.println("\nBuscar vinilos de AC-DC:");
        coleccionista.getColeccion().mostrarBusquedaPorArtista("AC-DC");

        System.out.println("\n=== Animales ===");
        Animal perro = new Perro("Rocky", 5);
        Animal gato = new Gato("Michi", 3);
        perro.hacerSonido();
        gato.hacerSonido();

        System.out.println("\n=== Universidad ===");
        Universidad u = new Universidad("Universidad de Chile");
        Facultad f1 = new Facultad("Facultad de Ingeniería");
        f1.agregarDepartamento(new Departamento("Informática"));
        f1.agregarDepartamento(new Departamento("Mecánica"));
        u.agregarFacultad(f1);
        u.mostrarEstructura();

        // --- Caso 4: Empresa con Vehículos ---
        System.out.println("\n=== Empresa de Transporte ===");
        Empresa e = new Empresa("TransNaviera S.A.");
        e.agregarVehiculo(new Moto("Yamaha", "MT-09"));
        e.agregarVehiculo(new Barco("Titanic", "Clase Olímpica"));
        e.mostrarVehiculos();
    }
}
