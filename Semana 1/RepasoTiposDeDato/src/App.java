public class App {

    final float pi = 3.14151617f;
    final float radius = 5.5f;

    public static void main(String[] args) throws Exception {
        primitiveTypes();
        referenceTypes();
        userDefinedTypes();
        System.out.println(numerosIguales(1, 2));
    }
    private static void primitiveTypes(){
        boolean isValue = false; //true 1 bit
        byte byteNumber = 10; //8 bits
        short shortNumber = 10; //16 bits
        int intNumber = 10; //32 bits
        long longNumber = 10; //64 bits
        float floatNumber = 10.0f; //32 bits floating number
        double doubleNumber = 10.0f; //64 bits double number
        char charValue = 'a'; //16 bits
    }
    private static void referenceTypes(){
        String stringObject = "Hello World!";
        Integer integerObject = 10;
        Double doubleObject = 10.0;
        Float floatObject = 10.0f;
        Boolean booleanObject = true;
        Byte byteObject = 10;
        Short shortObject = 10;
        Long longObject = 10L;
        Character charObject = 'A';
        String mySubstring = stringObject.substring(0,5);
    }
    private static void userDefinedTypes(){
        Person alonso = new Person();
        alonso.age = 20;
        alonso.name = "Alonso Ramírez";
        alonso.greet();
    }
    private static class Person{
        public String name;
        public short age;

        public void greet(){
            System.out.println("Hello world! My name is " + this.name);
        }
    }

    //Semana 2
    private static boolean numerosIguales(int numero1, int numero2){
        return numero1 == numero2;
    }
}
