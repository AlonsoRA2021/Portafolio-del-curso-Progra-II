package Origen;
public class Persona {
    //atributos
    private int id;
    public String nombre;
    public String apellido;
    public int edad;
    protected String me; //se utiliza para que no pueda heredar ni ser usado por otro padre o hijo
                         //por esa razon se usa la clase persona.java en otra carpeta para ejemplificar 

    //constructor
    public Persona(){} //se crea vacio para poder crear nuevas personas

    public Persona(int id){
        this.id = id;
    }

    public void setId(int id){
        if(this.id <= 0){
            this.id = id;
        }
    }

    /*@Override
    public String toString(){
        String me = "ID: " + Integer.toString(this.id);
        me += " Nombre: " + this.nombre;
        me += " Apellido: " + this.apellido;
        me += " Edad: " + Integer.toString(this.edad);
        return me;
    }*/

    //otra manera de hacerlo
    @Override
    public String toString(){
        this.me = "ID: " + Integer.toString(this.id);
        this.me += " Nombre: " + this.nombre;
        this.me += " Apellido: " + this.apellido;
        this.me += " Edad: " + Integer.toString(this.edad);
        return this.me;
    }
}

/*NOTA: this se utiliza para referirme a miembros de mi propia clase
        super para hacer referencia a metodos de mi ancestro
        @Override para sobreescribir un metodo de mi ancestro*/