package app.models.vehiculos;

abstract public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected int añoFabricacion;

    protected boolean reparado = false;

    public Vehiculo(String marca, String modelo, String matricula, int añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula.toUpperCase();
        this.añoFabricacion = añoFabricacion;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
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

    abstract public void reparar();

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