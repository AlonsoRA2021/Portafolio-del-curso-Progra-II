public class Tanteador {
    int puntuacion = 0;

    public void inicializar(){
        puntuacion = 0;
    }
    public void incrementar(){
        puntuacion += 5;
    }
    public void decrementar(){
        puntuacion -= 2;
    }
    public void mostrar(){
        System.out.println(puntuacion);
    }
}