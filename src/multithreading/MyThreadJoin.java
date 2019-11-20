package multithreading;

// Join is used to ensure that the main thread is the last to stop
// This method waits until the thread on which it is called terminates
public class MyThreadJoin implements Runnable {
    Thread thrd;

    // Construct a new thread.
    MyThreadJoin(String name) {
        thrd = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThreadJoin createAndStart(String name) {
        MyThreadJoin myThrd = new MyThreadJoin(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThreadJoin mt1 = MyThreadJoin.createAndStart("Child #1");
        MyThreadJoin mt2 = MyThreadJoin.createAndStart("Child #2");
        MyThreadJoin mt3 = MyThreadJoin.createAndStart("Child #3");

        try {
            mt1.thrd.join();
            System.out.println("Child #1 joined");
            mt2.thrd.join();
            System.out.println("Child #2 joined");
            mt3.thrd.join();
            System.out.println("Child #3 joined.");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
