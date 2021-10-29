public class App {
    public static void main(String[] args) throws Exception {
        NaveEspacial nave = new NaveEspacial("ovalada", "blaca", 800, 2000);
        Pelota pelota = new Pelota("redonda", "roja", 40, 500);

        nave.mostrarDatos();
        pelota.mostrarDatos();
    }
}
