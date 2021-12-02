package test.Entidades;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Entidades.Admin;
public class AdminTest {
    @Test
    public void testAdminVerMenu(){
        Admin admin = new Admin(789, " Alonso", " Ramírez", "ADMIN", "alonso2021", "12345");
        assertEquals(admin.rol, "ADMIN");
        assertEquals(admin.getUsuario(), "alonso2021");
        assertEquals(admin.getContrasena(), "12345");
    }
}
