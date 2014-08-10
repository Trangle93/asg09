
public class Node {
    public Item data;
    public Node next;
    
    public Node(Item data, Node next){
        this.data = data.clone();
        this.next = next;
    }
}
