public class BolaBillar extends BalonAmericano{
    
    public BolaBillar(String forma, String diseno, float peso, float diametro){
        super(forma, diseno, peso, diametro);
    }
    public void mostrarDatos(){
        System.out.println("Bola de billar");
        System.out.println("Forma: " + forma +
                         "\nDiseño: " + diseno +
                         "\nPeso: " + peso +
                         "\nDiámetro: " + diametro +
                         "\n");
    }
}
