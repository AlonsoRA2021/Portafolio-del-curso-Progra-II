public class App {
    public static void main(String[] args) throws Exception {
        //Persona estudiante = new Persona();
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.nombre = "Alonso";
        estudiante.apellido = "Ramirez";
        estudiante.nota = 100.00d;
        estudiante.edad = 25;
        estudiante.setId(2); //no realiza cambios en id porque esta protegido el atributo
        estudiante.saludar(); //metodo usando void cuando queremos devolver algo solo mostrar
        //System.out.println(estudiante.imprimir()); //metodo sin void cuando queremos devolver algo
        
        /*ejemplo de herencia
        Persona empleado = new Persona();
        empleado.nota = 70.75d;*/
        
        //ejemplo polimorfismo
        Persona persona = new Persona();
        persona.setId(3);
        verIdPersona(persona);
        verIdPersona(estudiante);
    }
    //ejemplo polimorfismo
    static void verIdPersona(Persona persona){
        System.out.println(persona.getId());
        
        //casting, validacion o transformacion explicita de datos del tipo de dato A al tipo de dato B
        if(persona instanceof Estudiante){ //instanceof permite llamar y ejecutar atributos de un objeto se espera sea hijo de otro objeto
            System.out.println(((Estudiante)persona).nota);
        }
    }
    
}
