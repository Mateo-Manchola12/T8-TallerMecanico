package app.models.vehiculos;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int añoFabricacion, int cilindrada) {
        super(marca, modelo, añoFabricacion);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void reparar() {
        reparado = true;
        System.out.print("La moto ha sido reparada\n");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\tCilindrada:%d\n", cilindrada);
    }
}