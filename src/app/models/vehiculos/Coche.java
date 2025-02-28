package app.models.vehiculos;

public class Coche extends Vehiculo implements IRevisable {
    private int numPuertas;

    public Coche(String marca, String modelo, String matricula, int añoFabricacion, int numPuertas) {
        super(marca, modelo, matricula, añoFabricacion);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void reparar() {
        reparado = true;
        System.out.print("El coche ha sido reparado\n");
    }

    @Override
    public void revisar() {
        System.out.print("El coche ha sido revisado\n");
    }

    @Override
    public String toString() {
        return String.format("Coche:%s\tNumero de puertas: %s", super.toString(), numPuertas);
    }
}