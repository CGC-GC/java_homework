package PR21.entities;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;

    @Override
    protected void enqueueImpl(T element) {
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }
    @Override
    protected T elementImpl() {
        return (T) elements[head];
    }
    @Override
    protected T dequeueImpl() {
        T removedElement = (T) elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
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
        elements = new Object[10];
        size = 0;
        head = 0;
    }
    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = Math.max(2 * elements.length, capacity);
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
        }
    }
}