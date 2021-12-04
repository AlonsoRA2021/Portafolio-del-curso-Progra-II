package Entidades;
import Enums.Materiales;

public class ObjetoMetalico extends Saltador{
    public ObjetoMetalico(int valorInicial){
        super(Materiales.METAL, valorInicial);
        this.fuerza = 20.0d;
        this.peso = 8.5d;
    }
}
