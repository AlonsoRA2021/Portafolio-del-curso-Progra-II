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
        System.out.println(node.getValue());
        if(this.next != null){
            this.getNext(this.next);
        }
    }
}
