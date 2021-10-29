public class BalonAmericano {
    public String forma;
    public String diseno;
    public float peso;
    public float diametro;

    public BalonAmericano(String forma, String diseno, float peso, float diametro){
        this.forma = forma;
        this.diseno = diseno;
        this.peso = peso;
        this.diametro = diametro;
    }
    public void mostrarDatos(){
        System.out.println("Balón de fútbol americano");
        System.out.println("Forma: " + forma +
                         "\nDiseño: " + diseno +
                         "\nPeso: " + peso +
                         "\nDiámetro: " + diametro +
                         "\n");
   }
}
