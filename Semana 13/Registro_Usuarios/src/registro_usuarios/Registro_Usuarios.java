package registro_usuarios;

import java.util.List;
import java.util.ArrayList;
import Gui.RegistroUsuarios;
import Entidades.Cliente;
import Entidades.Cajero;
import Entidades.Usuario;

public class Registro_Usuarios {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("123", "John", "Doe");
        Cajero cajero = new Cajero("456", "Jane", "Doe");
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(cliente);
        usuarios.add(cajero);
        RegistroUsuarios registro = new RegistroUsuarios(usuarios);
        registro.show();
    }
    
}
