// Time complexity of single-linked list get operation is O(n).


public class main {
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    public static void main(String[] args) {
        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");
        tom.next = dick;
        dick.next = harry;
        harry.next = sam;
//        printLinkedList(tom);
//        KWSingleLinkedList<String> names = new KWSingleLinkedList<>();
//        names.addFirst("Sam");
//        names.addFirst("Harry");
//        names.addFirst("Dick");
//        names.addFirst("Tom");

        Node<String> bob = new Node<>("Bob");
        bob.next = harry.next;
        harry.next = bob;

        printLinkedList(tom);
        Node<String> bill = new Node<>("Bill");
        insertBefore(tom, bill);
        Node<String> sue = new Node<>("Sue");
        insertBefore(sam, sue);
        printLinkedList(bill);

        removeNode(tom, "Bill");
        printLinkedList(tom);
        removeNode(bill, "Sam");
        printLinkedList(tom);


//        Node<Integer> five = new Node<>(5);
//        Node<Integer> ten = new Node<>(10);
//        Node<Integer> seven = new Node<>(7);
//        Node<Integer> thirty = new Node<>(50);
        KWSingleLinkedList<Integer> numbers = new KWSingleLinkedList<>();
        numbers.addFirst(5);
        numbers.addFirst(10);
        numbers.addFirst(7);
        numbers.addFirst(30);
        getSum(numbers);
//        printLinkedList(five);
//
//
//    }
    }

    private static void getSum(KWSingleLinkedList<Integer> list) {
        int sum = 0;
        KWSingleLinkedList.Node<Integer> nodeRef = list.getHead();
        while (nodeRef != null) {
            int value = nodeRef.data;
            sum += value;
            nodeRef = nodeRef.next;
        }
        System.out.println("Sum of all elements " + sum);
    }

    private static void insertBefore(Node<String> refNode, Node<String> newNode) {
        Node<String> current = refNode;
        while (current != null && current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }
        current = current.next;
    }

    private static void removeNode(Node<String> head, String data) {
        Node<String> current = head;
        Node<String> prev = null;

        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        if (prev != null) {
            prev.next = current.next;
        } else {
            head = current.next;
        }
    }

    private static void printLinkedList(Node<String> head) {
        Node<String> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
