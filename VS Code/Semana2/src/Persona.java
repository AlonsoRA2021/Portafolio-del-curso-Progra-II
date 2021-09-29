public class Persona {
    private int id = 0;
    public String nombre;
    public String apellido;
    public short edad;

    //para acceder a atributos privados
    public void setId(int valor){
        if(id <= 0){
            id = valor;
        }
    }
    public int getId(){return id;}

    //metodo usando void cuando queremos devolver algo solo mostrar
    public void saludar(){
        System.out.println(mensaje()); //se usa encapsulamiento
    }
    //metodo sin void cuando queremos devolver algo
    public String imprimir(){
        return "Soy " + nombre;
    }

    private String mensaje(){
        return "Hola me llamo " + nombre + " y mi ID es " + id; //retorno del encapsulamiento
    }

    //NOTA: la palabra reservada protected se utiliza para proteger llamado desde otras ventanas
}
