package Praktikum;

/**
 * @author Augie Winanda Favourite
 */
public class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;

    public Node( E e, Node<E> p, Node<E> n) {
        element = e;
        prev = p;
        next = n;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
