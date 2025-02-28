package app.models;

import java.util.ArrayList;

import app.models.vehiculos.IRevisable;
import app.models.vehiculos.Vehiculo;

public class TallerMecanico {
    private ArrayList<Vehiculo> vehiculos;

    public TallerMecanico() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public boolean addVehiculo(Vehiculo vehiculo) {
        return this.vehiculos.add(vehiculo);
    }

    public void showVehiculos() {
        for (Vehiculo vehiculo : this.vehiculos)
            System.out.println(vehiculo);

    }

    public Vehiculo findVehiculo(String matricula) {
        for (Vehiculo vehiculo : this.vehiculos)
            if (vehiculo.getMatricula().equals(matricula))
                return vehiculo;

        return null;
    }

    public boolean doMaintenance(Vehiculo vehiculo) {
        if (vehiculo.isReparado())
            return false;
        else {
            if (vehiculo instanceof IRevisable) {
                ((IRevisable) vehiculo).revisar();
            }
            vehiculo.reparar();
            return true;
        }
    }
}