import sun.awt.image.ImageWatched;

/**
 * Created by venkat on 7/8/17.
 */
public class LinkedListAddition {

    public LinkedListAddition next;

    public int data;

    LinkedListAddition(int d) {
        data = d;
        next = null;
    }

    LinkedListAddition(){}

    public static void main(String[] args) {

        LinkedListAddition insertLL1 = new LinkedListAddition();
        insertLL1.insert(7);
        insertLL1.insert(1);
        insertLL1.insert(6);

        LinkedListAddition insertLL2 = new LinkedListAddition();
        insertLL2.insert(5);
        insertLL2.insert(9);
        insertLL2.insert(2);

        //insertLL1.printInReverse(insertLL1.next);
        int carry = 0;

        System.out.print(LinkedListAddition.addLists(insertLL1, insertLL2, carry));
    }

    private static LinkedListAddition addLists(LinkedListAddition l1, LinkedListAddition l2, int carry) {

        if (l1 == null && l2 == null && carry == 0){
            return null;
        }

        int value = 0;
        if (l1 != null) {
            value += l1.data;
        }

        if(l2 != null) {
            value += l2.data;
        }

        LinkedListAddition result = new LinkedListAddition();

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            LinkedListAddition nodes = addLists(l1.next==null?null:l1.next, l2.next==null?null:l2.next, carry >=10?1:0);
            result.insert(nodes.data);
        }
        return result;
    }

    private void printInReverse(LinkedListAddition head) {

        if(head == null) {
            return;
        }

        printInReverse(head.next);
        System.out.println(head.data);
    }

    private void insert(int i) {
        LinkedListAddition newNode = new LinkedListAddition(i);
        newNode.next = next;
        next = newNode;
    }



}
