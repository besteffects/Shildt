package inheritance.interfaces.queue;

class IQDemo {

}

// a fixed-size queue class for characters
class FixedQueue implements ICharQ {
    private char q[]; //this array holds the queue
    private int putloc, getloc; // the put and get indices

    //Construct and empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue

        putloc = getloc = 0;
    }

    // Put a character into the queue
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    //Get a character from the queue.
    public char get() {
        if (getloc == putloc) {
            System.out.println(" Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// A circular queue.
class CircularQueue implements ICharQ {
    private char q[]; //this array holds the queue
    private int putloc, getloc; // the put and the get indices

    //Construct an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size + 1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    //Put a character into the queue.
    public void put(char ch) {
        /*
        Queue is full if either putloc is one less than getloc, or if putloc is at the end
        of the array and getloc is at the beginning.
         */
        if (putloc + 1 == getloc |
                ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) {
            putloc = 0;  // loop back
        }
    }

    //Get a character from the queue.
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) {
            getloc = 0; // loop back
        }
        return ch;
    }
}

// A dynamic queue
class DynQueue implements ICharQ {
    private char q[]; //this array holds the queue
    private int putloc, getLoc; // the put and get indices

    //Construct an empty queue given its size
    public DynQueue(int size) {
        q = new char[size]; //allocate memory for queue
        putloc = getLoc = 0;
    }

    //put the character into the queue
    public void put(char ch) {
        if (putloc == q.length) {
            //increase queue size
            char t[] = new char[q.length * 2];

            //copy elements into new queue
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }

    //get a character from the queue.
    public char get() {
        if (getLoc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getLoc++];
    }
}
