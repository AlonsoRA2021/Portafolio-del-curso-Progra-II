public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Persona miPersona = new Persona();
        Estudiante estudiante = new Estudiante();
        //asignar
        estudiante.setId(1);
        estudiante.nombre = "Alonso";
        estudiante.apellido = "Ramirez";
        estudiante.edad = 25;
        estudiante.setNota(100); //cuando la clase es privada se debe usar set y get para acceder (encapsulamiento)
        System.out.println(estudiante.toString());
    }
}
