public class Node {
    public Node next;
    private String value;
    public Node(final String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public void getNext(final Node node){
        System.out.print(node.getValue());
        if(node.next != null){
            this.getNext(node.next);
        }
    }
    
}
