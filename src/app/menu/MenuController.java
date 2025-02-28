package app.menu;

import app.models.TallerMecanico;
import app.models.vehiculos.Coche;
import app.models.vehiculos.Moto;
import app.models.vehiculos.Vehiculo;

public class MenuController {
    private Integer option;
    private Integer options;
    private TallerMecanico taller;

    public MenuController() {
        this.option = 0;
        this.options = 0;
        this.taller = new TallerMecanico();
    }

    public void start() {
        do {
            options = Menu.showMenu();
            option = InputHelpers.getInt("Indique una opción", 1, options);
            handleMenu();
        } while (option != options);
    }

    private void handleMenu() {
        Menu.clearMenu();
        switch (option) {
            case 1:
                createVehiculo();
                break;
            case 2:
                taller.showVehiculos();
                break;
            case 3:
                System.out.println("Opción no implementada");
                break;
        }
    }

    private void createVehiculo() {
        Vehiculo vehiculo = null;

        Integer options = Menu.showCreateVehiculoMenu();
        Integer option = InputHelpers.getInt("Indique una opción", 1, options);

        if (option == options) {
            return;
        }

        String marca = InputHelpers.getString("Indique la marca");
        String modelo = InputHelpers.getString("Indique el modelo");
        String matricula = InputHelpers.getString("Indique la matricula").toUpperCase();
        int añoFabricacion = InputHelpers.getInt("Indique el año de fabricación", 1900, 2025);

        switch (option) {
            case 1:
                int numPuertas = InputHelpers.getInt("Indique el número de puertas", null, null);
                vehiculo = (Vehiculo) new Coche(marca, modelo, matricula, añoFabricacion, numPuertas);
                break;

            case 2:
                int cilindrada = InputHelpers.getInt("Indique la cilindrada", null, null);
                vehiculo = (Vehiculo) new Moto(marca, modelo, matricula, añoFabricacion, cilindrada);
                break;
        }

        if (vehiculo != null) {
            taller.addVehiculo(vehiculo);
        }
    }
}