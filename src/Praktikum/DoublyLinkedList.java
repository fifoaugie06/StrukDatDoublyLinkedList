package Praktikum;

/**
 * @author Augie Winanda Favourite
 */
public class DoublyLinkedList<E> {
    Node<E> head; //dummy node for sentinel
    Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getPrev().getElement();
    }

    //metode untuk menyisipkan elemen di antara 2 elemen
    private void addBetween(E e, Node<E> before, Node<E> after) {
        Node<E> newNode = new Node<>(e, before, after);
        before.setNext(newNode);
        after.setPrev(newNode);
        size++;
    }

    public void addFirst(E e) {
        addBetween(e, head, head.getNext());
    }

    public void addLast(E e) {
        addBetween(e, tail.getPrev(), tail);
    }

    private E remove(Node<E> node) {
        Node<E> before = node.getPrev();
        Node<E> after = node.getNext();
        before.setNext(after);
        after.setPrev(before);
        size--;
        return node.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return (remove(head.getNext()));
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return (remove(tail.getPrev()));
    }
}
