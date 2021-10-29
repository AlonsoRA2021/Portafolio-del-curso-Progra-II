public class Pelota extends NaveEspacial{

    public Pelota(String forma, String color, int velocidad, int peso){
        super(forma, color, velocidad, peso);
    }
    public void mostrarDatos(){
        System.out.println("Pelota");
        System.out.println("Forma: " + forma +
                         "\nColor: " + getColor() +
                         "\nVelocidad: " + velocidad +
                         "\nPeso: " + peso +
                         "\n");
    }
}

