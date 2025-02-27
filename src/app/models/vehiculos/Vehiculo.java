package app.models.vehiculos;

abstract public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected boolean reparado = false;

    public Vehiculo(String marca, String modelo, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public boolean isReparado() {
        return reparado;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        \tMarca: %s
                        \tModelo: %s
                        \tAño de Fabricación: %d
                        \tReparado: %b
                        """,
                marca, modelo, añoFabricacion, reparado);
    }

}