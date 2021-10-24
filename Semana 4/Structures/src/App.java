public class App {
    public static void main(String[] args) throws Exception {
        /*Node firstNodo = new Node("H");
        Node secondNodo = new Node("E");
        Node thirdNodo = new Node("L");
        Node fourthNodo = new Node("L");
        Node fifthNodo = new Node("O");
        firstNodo.next = secondNodo;
        secondNodo.next = thirdNodo;
        thirdNodo.next = fourthNodo;
        fourthNodo.next = fifthNodo;
        firstNodo.getNext(firstNodo);*/

        //imprimir String en caracteres
        Node firstNodo = new Node('H',
            new Node('E',
                new Node('L',
                    new Node('L',
                            new Node('O')))));
        //firstNodo.getNext(firstNodo);
        //doble nodo enlazado 
        DNode one = new DNode("B",
                    new DNode("A"),
                    new DNode("C",
                    new DNode("D",
                    new DNode("E"))));
        System.out.println(one.goForward(one));
        System.out.println(one.goBackwards(one));
    }
}