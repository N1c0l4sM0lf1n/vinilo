package coleccionVinilos;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("La moto " + marca + " se mueve en carretera.");
    }
}
