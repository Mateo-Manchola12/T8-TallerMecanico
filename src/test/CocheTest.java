package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import app.models.vehiculos.Coche;

public class CocheTest {
    @Test
    public void testCoche() {
        Coche coche = new Coche("Toyota", "Corolla", "HJPL267", 2021, 4);
        assertEquals("Toyota", coche.getMarca());
        assertEquals("Corolla", coche.getModelo());
        assertEquals(2021, coche.getAñoFabricacion());
        assertEquals(4, coche.getNumPuertas());
        assertFalse(coche.isReparado());
        coche.reparar();
        assertTrue(coche.isReparado());
    }

}