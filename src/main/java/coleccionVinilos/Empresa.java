package coleccionVinilos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected String nombre;
    protected List<Vehiculo> vehiculos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarVehiculos() {
        System.out.println("Empresa: " + nombre);
        for (Vehiculo v : vehiculos) {
            v.mover();
        }
    }
}
