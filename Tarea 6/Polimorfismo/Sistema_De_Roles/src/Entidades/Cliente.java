package Entidades;

import Interfaces.Visible;

public class Cliente extends Persona implements Visible{
    public String provincia;
    public String estado;
    public Cliente(int id, String nombre, String apellido){
        super(id, nombre, apellido);
    }

    @Override
    public void verMenu(){

    }
}
