import services.Escritor;
import services.Lector;

public class App {

    public static void main(String[] args) throws Exception {
        Lector lector = new Lector("C:\\Users\\Call My Way\\Documents\\UAM\\Bloque 3\\3. Programación 2\\VS Code\\Portafolio-del-curso-Progra-II\\Semana 11\\PersistenciaDeDatos\\bin\\Archivo.txt");
        //String texto = lector.leer();
        //System.out.println(texto);
        //lector.leerLineaPorLinea();
        //System.out.println(lector.leerTodasLasLineas());
        Escritor escritor = new Escritor("C:\\Users\\Call My Way\\Documents\\UAM\\Bloque 3\\3. Programación 2\\VS Code\\Portafolio-del-curso-Progra-II\\Semana 11\\PersistenciaDeDatos\\bin\\Archivo.txt");
        //escritor.escribirLetraPorLetra("Asi escribe el escritor caracter por caracter");
        //escritor.escribirLinea("Asi escribe el escritor caracter por caracter");
        escritor.agregarTexto("Nueva linea");
    }
}
