/**
 * Created by venkat on 7/6/17.
 */
public class LinkedListkthItemFromLast {

    public Node head; // head of the list

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }



    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /*Drier program to test above methods */
    public static void main(String [] args)
    {
        LinkedListkthItemFromLast llist = new LinkedListkthItemFromLast();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(1, llist.head);

        LinkedListkthItemFromLast llist1 = new LinkedListkthItemFromLast();
        llist1.push(2);
        llist1.push(4);
        llist1.push(1);
        llist1.push(3);

        llist.printNthFromLast(1, llist1.head);
    }

    private int printNthFromLast(int k, Node head) {
        if(head == null) {
            return 0;
        }

        int index = printNthFromLast(k, head.next) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is "+ head.data);
        }
        System.out.println(index);
        return index;
    }


}
