package app.models.vehiculos;

public class Moto extends Vehiculo implements IRevisable {
    private int cilindrada;

    public Moto(String marca, String modelo, String matricula, int añoFabricacion, int cilindrada) {
        super(marca, modelo, matricula, añoFabricacion);
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
    public void revisar() {
        System.out.print("La moto ha sido revisada\n");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\tCilindrada:%d\n", cilindrada);
    }
}