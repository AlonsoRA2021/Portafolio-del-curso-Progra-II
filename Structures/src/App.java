public class App {
    public static void main(String[] args) throws Exception {
        Node firstNodo = new Node("H");
        Node secondNodo = new Node("E");
        Node thirdNodo = new Node("L");
        Node fourthNodo = new Node("L");
        Node fifthNodo = new Node("O");
        firstNodo.next = secondNodo;
        secondNodo.next = thirdNodo;
        thirdNodo.next = fourthNodo;
        fourthNodo.next = fifthNodo;
        firstNodo.getNext(firstNodo);
    }
}
