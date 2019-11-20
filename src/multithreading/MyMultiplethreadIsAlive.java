package multithreading;

// Use is alive. IsAlive is used to wait for child threads to terminate
class MyMultiplethreadIsAlive implements Runnable {
    Thread thrd;

    //Construct a new thread.
    MyMultiplethreadIsAlive(String name) {
        thrd = new Thread(this, name);
    }

    //A factory method that creates and starts a thread.
    public static MyMultiplethreadIsAlive createAndStart(String name) {
        MyMultiplethreadIsAlive myThrd = new MyMultiplethreadIsAlive(name);

        myThrd.thrd.start(); //start the thread
        return myThrd;
    }

    //Entry point of thread. Implementing run() method
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

class MoreThreads1 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyMultiplethreadIsAlive mt1 = MyMultiplethreadIsAlive.createAndStart("Child #1");
        MyMultiplethreadIsAlive mt2 = MyMultiplethreadIsAlive.createAndStart("Child #2");
        MyMultiplethreadIsAlive mt3 = MyMultiplethreadIsAlive.createAndStart("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() ||
                mt3.thrd.isAlive());

        System.out.println("Main thread ending.");
    }

}
