package Entidades;

import Enums.Tipos;

public abstract class Operacion{
    public double numeroUno;
    public double numeroDos;
    private Tipos tipo;

    public Operacion(double numeroUno, double numeroDos, Tipos tipo){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.tipo = tipo;
    }
    public Tipos getTipo(){
        return this.tipo;
    }
}