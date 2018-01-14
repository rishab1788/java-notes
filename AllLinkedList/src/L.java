import java.util.*;

class L {
    static Stack stack = new Stack();
LinkedList  ls= new LinkedList();
    public static void main(String[] args) {
//        Node n1 = new Node();
//
//        Node n2 = new Node();
//        Node n3 = new Node();
//        Node n4 = new Node();
//        n1.data = 54;
//        n2.data = 454;
//        n3.data = 654;
//        n4.data = 584;
//        n1.node = n2;
//        n2.node = n3;
//        n3.node = n4;
//        n4.node = null;

         Node n = createLinkedList(6);

        n = insertAtBeg(52, n);

        System.out.println();
        recursiveTraverse(n);

        n = insertAtEnd(45, n);

        System.out.println();
        recursiveTraverse(n);

        n = deleteNodeBeg(n);

        System.out.println();
        recursiveTraverse(n);

        n = deleteNodeEnd(n);

        recursiveTraverse(n);
        n = insertAtNth(235, n, 3);

        recursiveTraverse(n);

        n = deleteNodeNth(n, 0);

        recursiveTraverse(n);

        n = Reverse(n);


        recursiveTraverse(n);


        //int h = 0;
        // Scanner scan = new Scanner(System.in);


        // whileTravers(n1);

    }

    static Node Reverse(Node head) {
        Node n = head;

        System.out.println("\n\n\n");

        while (n != null) {
            stack.push(n.data);
            n = n.node;
        }
        Node last = head;

        System.out.print("reversed");
        while (!stack.isEmpty()) {
            int d = (int) stack.pop();

            System.out.print("  " + d);
            last.data = d;
            last = last.node;
        }


        return head;


    }




    static Node deleteNodeNth(Node n, int p) {
        if (n == null) {
            return n;
        }
        if (p == 0) {
            n = n.node;
            return n;
        }

        Node current = n;
        p = p - 1;
        while (p-- > 0 && current != null) {
            current = current.node;
        }
        System.out.print(current.data + "deleted");
        current.node = current.node.node;


        return n;
    }

    static Node deleteNodeEnd(Node n) {
        if (n == null) {
            return n;
        }
        Node current = n;
        while (current.node.node != null) {
            current = current.node;
        }
        System.out.print(current.node.data + "is deleting");
        current.node = null;

        return n;
    }

    static Node deleteNodeBeg(Node n) {
        if (n == null) {
            return n;
        }

        System.out.print(n.data + "is deleting");
        n = n.node;
        return n;


    }

    static Stack s = new Stack();

    static void recursiveTraverse(Node n) {


        if (n == null) {
            return;
        } else {
            System.out.println(n.data);

            n = n.node;
            recursiveTraverse(n);
        }
    }

    static void whileTravers(Node n) {
        while (n != null) {
            System.out.println(n.data);
            s.push(n.data);
            n = n.node;
        }
    }

    static Node createLinkedList(int size) {
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node();
            nodes[i].data = i;
        }
        for (int i = 0; i < size - 1; i++) {
            nodes[i].node = nodes[i + 1];
        }
        return nodes[0];
    }

    static Node insertAtBeg(int data, Node actualNode) {
        Node tempNode = new Node();
        tempNode.data = data;
        if (actualNode == null) {
            return tempNode;
        }
        tempNode.node = actualNode;
        return tempNode;
    }

    static Node insertAtEnd(int data, Node actualNode) {
        Node tmp = new Node();
        tmp.data = data;
        tmp.node = null;
        if (actualNode == null) {
            actualNode = tmp;
            return actualNode;
        }

        Node current = actualNode;
        while (current.node != null) {
            current = current.node;
        }
        current.node = tmp;
        return actualNode;
    }

    static Node insertAtNth(int data, Node actualNode, int p) {
        Node temp = new Node();
        temp.data = data;
        temp.node = null;
        if (p == 0) {
            temp.node = actualNode;
            return temp;
        }
        Node current = actualNode, temp1 = new Node();
        p--;
        while (p-- > 0) {
            current = current.node;
        }

        Node right = current.node;
        current.node = temp;
        current = current.node;
        current.node = right;

        return actualNode;
    }


}