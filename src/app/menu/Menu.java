package app.menu;

import java.util.ArrayList;

import app.models.vehiculos.Vehiculo;

public class Menu {

    public static int showMenu() {
        String[] options = {
                "Crear Vehiculo",
                "Mostrar Vehiculos",
                "Realizar Mantenimiento" };

        System.out.println("Menu");

        for (int i = 0; i < options.length; i++) {
            System.out.printf("%n\t%d - %s", i + 1, options[i]);
        }

        System.out.printf("%n\t%d - Salir", options.length + 1);

        return options.length + 1;
    }

    public static int showCreateVehiculoMenu() {
        String[] options = {
                "Crear Coche",
                "Crear Moto" };

        System.out.println("Crear Vehiculo");

        for (int i = 0; i < options.length; i++) {
            System.out.printf("%n\t%d - %s", i + 1, options[i]);
        }

        System.out.printf("%n\t%d - volver", options.length + 1);

        return options.length + 1;
    }

    public static void showVehiculos(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Mostrar Vehiculos");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void showVehiculosPlates(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Mostrar Vehiculos");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\t ->" + vehiculo.getMatricula());
        }
    }

    public static void clearMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}