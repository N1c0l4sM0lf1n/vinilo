package coleccionVinilos;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Departamento> departamentos;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento d) {
        departamentos.add(d);
    }

    public void mostrarDepartamentos() {
        System.out.println("  Facultad: " + nombre);
        for (Departamento d : departamentos) {
            System.out.println("    Departamento: " + d.getNombre());
        }
    }
}
