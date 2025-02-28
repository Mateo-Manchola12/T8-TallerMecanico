package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import app.models.vehiculos.Coche;
import app.models.vehiculos.Moto;
import app.models.TallerMecanico;

public class TallerTest {
    @Test
    public void testTaller() {
        TallerMecanico taller = new TallerMecanico();
        Coche coche = new Coche("Toyota", "Corolla", "HJPL267", 2021, 4);
        Moto moto = new Moto("Honda", "CBR", "4512ASB", 2021, 600);
        taller.addVehiculo(coche);
        taller.addVehiculo(moto);

        taller.showVehiculos();
        assertEquals(coche, taller.findVehiculo("HJPL267"));
        assertEquals(moto, taller.findVehiculo("4512ASB"));

        taller.doMaintenance(coche);
        taller.doMaintenance(moto);
        assertTrue(coche.isReparado());
        assertTrue(moto.isReparado());
    }
}
