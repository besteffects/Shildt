package chapter13.generics.QueueImp;

// An exception for full queue-full errors
class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nQueue is full.Maximum size is " + size;
    }
}

