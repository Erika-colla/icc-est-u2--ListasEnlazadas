package models;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value){

    }

    public void findByValue(T value ){

    }

    public void deleteByValue(T value){

    }

    public int size() {
        return size;
    }

    public void printLinkedList() {
        Node<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
