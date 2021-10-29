public class NaveEspacial {
    public String forma;
    private String color;
    public int velocidad;
    public int peso;

    public NaveEspacial(String forma, String color, int velocidad, int peso){
        this.forma = forma;
        this.color = color;
        this.velocidad = velocidad;
        this.peso = peso;
    }
    public String getColor(){
        return color;
    }
    public void mostrarDatos(){
        System.out.println("Nave espacial");
        System.out.println("Forma: " + forma +
                         "\nColor: " + color +
                         "\nVelocidad: " + velocidad +
                         "\nPeso: " + peso +
                         "\n");
    }

}
