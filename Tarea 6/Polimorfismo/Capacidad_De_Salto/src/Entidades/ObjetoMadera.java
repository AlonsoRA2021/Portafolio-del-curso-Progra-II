package Entidades;
import Enums.Materiales;

public class ObjetoMadera extends Saltador{
    public ObjetoMadera(int valorInicial){
        super(Materiales.MADERA, valorInicial);
        this.fuerza = 10.0d;
        this.peso = 5d;
    }
}
