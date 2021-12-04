package Excepciones;

public class ExcepcionDato extends Exception{
    public ExcepcionDato(){
        super("El dato ingresado no es correcto!");
    }
    public ExcepcionDato(final String mensaje){
        super(mensaje);
    }
}
