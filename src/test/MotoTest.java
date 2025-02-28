package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import app.models.vehiculos.Moto;

public class MotoTest {
    @Test
    public void testMoto() {
        Moto moto = new Moto("Honda", "CBR", "4512ASB", 2021, 600);
        assertEquals("Honda", moto.getMarca());
        assertEquals("CBR", moto.getModelo());
        assertEquals(2021, moto.getAñoFabricacion());
        assertEquals(600, moto.getCilindrada());
        assertFalse(moto.isReparado());
        moto.reparar();
        assertTrue(moto.isReparado());
    }

}