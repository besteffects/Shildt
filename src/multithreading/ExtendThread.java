package multithreading;

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyExtendThread mt = new MyExtendThread("Child #1");

        mt.start();

        //Can be replaced with createAndStart()

        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }

    //Can be replaced with a static factory method createAndStart()
    public static MyExtendThread createAndStart(String name) {
        MyExtendThread myThrd = new MyExtendThread(name);
        myThrd.start();
        return myThrd;
    }

    /*
    To try createAndStart replace
    System.out.println("Main thread starting.");
    MyExtendThread mt = new MyExtendThread(Child #1)
    with
    MyExtendThread mt = MyExtendThread.createAndStart(Child #1)
     */
}

class MyExtendThread extends Thread {
    // Construct a new thread.
    MyExtendThread(String name) {
        //name thread. Super is used to call this version of Thread's constructor:
        //Thread(String threadName)
        super(name);
        //Thread provides the ability to hold a thread's name.
        //Thus, no instance variable is required by MyExtendThread to store the name

    }

    // Entry point of Thread
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + " terminating.");
    }
}
