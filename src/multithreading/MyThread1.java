package multithreading;

/*
MyThread variations. This version of MyThread
creates a Thread when its constructor is called and
stores it in an instance variable called thrd.
It also sets the name of the thread and provides
a factory method to create and start thread.
 */
class MyThread1 implements Runnable {
    private Thread thrd; // a reference to thread is stored in thrd

    // construct a new thread using this Runnable and give it a name
    MyThread1(String name) {
        thrd = new Thread(this, name); // the thread is named when it is created
    }

    //A factory method that creates and starts a thread
    static MyThread1 createAndStart(String name) {
        MyThread1 myThrd = new MyThread1(name);

        myThrd.thrd.start(); // begin executing the thread
        return myThrd;
    }

    // Entry point of thread
    public void run() {
        System.out.println(thrd.getName() + " starting ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating. ");
    }
}

class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //Create and start a thread.
        MyThread1 mt = MyThread1.createAndStart("Child #1"); // now the thread starts when it is created

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
