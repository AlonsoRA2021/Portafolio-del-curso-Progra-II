package Entidades;
import Enums.Materiales;

public class ObjetoPlastico extends Saltador{
    public ObjetoPlastico(int valorInicial){
        super(Materiales.PLASTICO, valorInicial);
        this.fuerza = 5.0d;
        this.peso = 1.5d;
    }
}
