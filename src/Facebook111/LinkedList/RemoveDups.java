import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public static void main(String args[]) {
       Node node =  new Node(2);
       node.next = new Node(7);
       node.next.next = new Node(5);
       node.next.next.next = new Node(7);
       LLNodeRemove rem = new LLNodeRemove();
       
       Node node1 = rem.removeDups(node);
       while(node1 != null) {
        System.out.println("Value: "+node1.data);
        node1 = node1.next;
       }
    }
    
   public Node removeDups(Node head) {
    if(head == null) return head;
  
    Node cur = head;
    Node prev = null;
    HashSet<Integer> set = new HashSet<Integer>();
    while( cur != null) {
        if(!set.contains(cur.data)){
            set.add(cur.data);
            prev = cur;
      
        } else {
            prev.next = cur.next;
        }
        cur = cur.next;
    }
    return head;
   }

}
class Node {
  int data;
  Node next;
  Node(int data){
    this.data=  data;
    next = null;
  }
}
