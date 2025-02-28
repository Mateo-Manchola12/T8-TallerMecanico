package app.menu;

public class Menu {

    public static int showMenu() {
        String[] options = {
                "Crear Vehiculo",
                "Mostrar Vehiculos",
                "Realizar Mantenimiento" };

        System.out.println("Menu");

        for (int i = 0; i < options.length; i++) {
            System.out.printf("\t%d - %s%n", i + 1, options[i]);
        }

        System.out.printf("\t%d - Salir%n", options.length + 1);

        return options.length + 1;
    }

    public static int showCreateVehiculoMenu() {
        String[] options = {
                "Crear Coche",
                "Crear Moto" };

        System.out.println("Crear Vehiculo");

        for (int i = 0; i < options.length; i++) {
            System.out.printf("\t%d - %s%n", i + 1, options[i]);
        }

        System.out.printf("\t%d - Volver%n", options.length + 1);

        return options.length + 1;
    }

    public static void clearMenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}