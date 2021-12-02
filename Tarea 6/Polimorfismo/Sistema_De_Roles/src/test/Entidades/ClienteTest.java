package test.Entidades;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Entidades.Cliente;
public class ClienteTest {
    @Test
    public void testCajeroVerMenu(){
        Cliente cliente = new Cliente(123, "Carlos", " Leiva", "CLIENTE", "San Jose", "Nuevo");
        assertEquals(cliente.rol, "CLIENTE");
    }
}
