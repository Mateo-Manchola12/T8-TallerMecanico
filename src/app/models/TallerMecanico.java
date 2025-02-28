package app.models;

import java.util.ArrayList;
import java.util.Collections;

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
            System.out.println(vehiculo + "\n");

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

    public void showVehiculosPlates() {
        System.out.println("Mostrar Vehiculos");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\t ->" + vehiculo.getMatricula());
        }
    }

    public boolean hasVehiculos() {
        return !this.vehiculos.isEmpty();
    }

    public void sortVehiculosByYear() {
        Collections.sort(this.vehiculos);
    }

    public Vehiculo getOldestVehiculoIterative() {
        Vehiculo oldest = null;
        for (Vehiculo vehiculo : this.vehiculos) {
            if (oldest == null || vehiculo.getAñoFabricacion() < oldest.getAñoFabricacion()) {
                oldest = vehiculo;
            }
        }
        return oldest;
    }

    public Vehiculo getOldestVehiculoRecursive(Vehiculo older, int index) {
        if (index == this.vehiculos.size()) {
            return older;
        }

        Vehiculo vehiculo = this.vehiculos.get(index);

        if (older == null || vehiculo.getAñoFabricacion() < older.getAñoFabricacion()) {
            older = vehiculo;
        }

        return getOldestVehiculoRecursive(older, index + 1);

    }

    public Vehiculo getOldestVehiculoRecursive() {
        return getOldestVehiculoRecursive(null, 0);
    }
}