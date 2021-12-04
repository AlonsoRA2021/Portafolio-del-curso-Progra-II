package Entidades;
import Enums.Materiales;
import Interfaces.Saltable;

public abstract class Saltador implements Saltable{
    private int valorInicial = 0;
    private Materiales material;
    public double peso;
    public double fuerza;

    public Saltador(Materiales material, int valorInicial){
        this.valorInicial = valorInicial;
        this.material = material;
    }
    public int getValorInicial(){
        return this.valorInicial;
    }
    public Materiales getMaterial(){
        return this.material;
    }
    @Override
    public int saltar() {
        return ((Double)((this.fuerza * this.valorInicial) / this.peso)).intValue();
    }
}
