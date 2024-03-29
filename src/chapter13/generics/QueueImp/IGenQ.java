package chapter13.generics.QueueImp;


public interface IGenQ<T> {

    //Put an item into the queue
    void put(T ch) throws QueueFullException;

// Get an item from the queue.
    T get() throws QueueEmptyException;
}
