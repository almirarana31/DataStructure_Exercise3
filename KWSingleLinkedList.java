public class KWSingleLinkedList<E> {
    static class Node<E> {
        public E data;
        public Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

    private Node<E> head = null;
    private int size = 0;

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void addAfter(Node<E> node, E item){
        node.next = new Node<>(item, node.next);
        size++;
    }

    public Node<E> getHead() {
        return head;
    }
}
