package PR21.entities;

public class LinkedQueue<T> extends AbstractQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    protected void enqueueImpl(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    @Override
    protected T elementImpl() {
        return head.value;
    }
    @Override
    protected T dequeueImpl() {
        T removedElement = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return removedElement;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}