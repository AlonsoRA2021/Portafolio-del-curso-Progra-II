package Entidades;

public abstract class Persona {
    private int id = 0;
    public String nombre;
    public String apellido;
    public int edad;
    public String rol;
    public Persona(String rol){
        this.rol = rol;
    }
    /*public Persona(int id, String nombre, String apellido, String rol){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }*/
    public int getId(){
        return this.id;
    }
}
