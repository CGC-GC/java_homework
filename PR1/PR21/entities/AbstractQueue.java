package PR21.entities;
import PR21.interfaces.Queue;
import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> implements Queue<T> {
    @Override
    public void enqueue(T element) {
        if (element != null) {
            enqueueImpl(element);
        }
    }
    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elementImpl();
    }
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return dequeueImpl();
    }

    protected abstract void enqueueImpl(T element);
    protected abstract T elementImpl();
    protected abstract T dequeueImpl();
}