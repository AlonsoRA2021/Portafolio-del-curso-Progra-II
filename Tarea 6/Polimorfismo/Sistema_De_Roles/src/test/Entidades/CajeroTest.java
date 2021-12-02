package test.Entidades;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Entidades.Cajero;
public class CajeroTest {
    @Test
    public void testCajeroVerMenu(){
        Cajero cajero = new Cajero(456, "Luis", " Artavia", "CAJERO", "Nocturno");
        assertEquals(cajero.rol, "CAJERO");
    }
}