package collection;

/**
 * Created by caoyuncong on
 * 2017/4/11 10:38
 * JavaSE_2017.
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;
    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
    }

    public String remove(int index) {
        Node node = getNode(index);
        String element = node.elememt;
        Node prev = node.prev;
        Node next = node.next;
        if (prev == null && next == null) {
            node.elememt = null;
        } else if (prev == null) {
            first = next;
            next.prev = null;
            node.next = null;
            node.elememt = null;
        } else if (next == null) {
            last = prev;
            prev.next = null;
            node.prev = null;
            node.elememt = null;
        } else {
            prev.next = next;
            next.prev = prev;
            node.prev = null;
            node.next = null;
            node.elememt = null;
        }
        return element;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public String get(int index) {
        return getNode(index).elememt;
    }

    private String first() {
        return first.elememt;
    }
    private String last() {
        return last.elememt;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }

        return true;
    }

    private class Node {
        String elememt;
        Node prev; // prev previous
        Node next;

        public Node(String elememt, Node prev, Node next) {
            this.elememt = elememt;
            this.prev = prev;
            this.next = next;
        }
    }
}
