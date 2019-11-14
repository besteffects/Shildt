package exceptions.queue;

public class FixedQueue implements ICharQ {
    private char q[]; //this array holds the queue
    private int putloc, getloc; // the put and get indices

    //construct an empty queue given its size
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    //Put a character into the queue.
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        } else {
            q[putloc++] = ch;
        }
    }

    //Get a character from queue
    public char get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
}

//Demonstrate the queue exceptions
class QExcDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;
        try {
            //overrun the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            // over-empty the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);

            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
