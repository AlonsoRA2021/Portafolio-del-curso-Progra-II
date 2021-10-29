public class App {
    public static void main(String[] args) {
        Tanteador miTanteador = new Tanteador();

        miTanteador.inicializar();
        System.out.print("Puntuacion inicial: ");
        miTanteador.mostrar();
        miTanteador.incrementar();
        System.out.print("Puntuacion aumentada: ");
        miTanteador.mostrar();
        miTanteador.decrementar();
        System.out.print("Puntuacion disminuida: ");
        miTanteador.mostrar();
        miTanteador.inicializar();
        System.out.print("Se inicializa puntuacion nuevamente: ");
        miTanteador.mostrar();
        System.out.print("GAME OVER...");

    }
}
