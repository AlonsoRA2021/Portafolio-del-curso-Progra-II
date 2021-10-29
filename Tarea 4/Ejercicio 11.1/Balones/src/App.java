public class App {
    public static void main(String[] args) throws Exception {
        BalonAmericano balonAmericano = new BalonAmericano("ovalada", "aerodinámico", 20.5f, 50.5f);
        BolaBillar bolaBillar = new BolaBillar("redonda", "pesada", 60.10f, 15.1f);

        balonAmericano.mostrarDatos();
        bolaBillar.mostrarDatos();
    }
}
