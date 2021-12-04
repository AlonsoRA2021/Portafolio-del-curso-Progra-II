import Entidades.ObjetoMadera;
import Entidades.ObjetoMetalico;
import Entidades.ObjetoPlastico;
import Servicios.Calculador;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La distancia de un saltador de madera es "+Calculador.calcularPosicion(new ObjetoMadera(10)));
        System.out.println("La distancia de un saltador de metal es "+Calculador.calcularPosicion(new ObjetoMetalico(10)));
        System.out.println("La distancia de un saltador de plástico es "+Calculador.calcularPosicion(new ObjetoPlastico(10)));
    }
}
