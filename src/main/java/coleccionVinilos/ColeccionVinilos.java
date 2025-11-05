package coleccionVinilos;

import java.util.ArrayList;

public class ColeccionVinilos {
    private final int MAX_VINILOS = 100;
    private ArrayList<Vinilo> vinilos;

    public ColeccionVinilos() {
        vinilos = new ArrayList<>();
    }

    public boolean agregarVinilo(String artista, String disco, String anio) {
        if (vinilos.size() >= MAX_VINILOS) {
            System.out.println("La colección está llena. No se puede agregar más vinilos.");
            return false;
        }
        vinilos.add(new Vinilo(artista, disco, anio));
        return true;
    }

    public int totalVinilos() {
        return vinilos.size();
    }

    public int espaciosDisponibles() {
        return MAX_VINILOS - vinilos.size();
    }

    public void mostrarColeccion() {
        if (vinilos.isEmpty()) {
            System.out.println("La colección está vacía.");
        } else {
            System.out.println("Colección de vinilos:");
            for (Vinilo v : vinilos) {
                System.out.println(v);
            }
        }
    }

    public void mostrarBusquedaPorArtista(String artista) {
        System.out.println("\nBuscando vinilos de: " + artista);
        boolean encontrado = false;
        for (Vinilo v : vinilos) {
            if (v.getArtista().equalsIgnoreCase(artista)) {
                System.out.println(v);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron vinilos del artista: " + artista);
        }
    }
}
