package multithreading;
//Create multiple threads

class MyMultipleThread implements Runnable {
    Thread thrd;

    //Construct a new thread.
    MyMultipleThread(String name) {
        thrd = new Thread(this, name);
    }

    //A factory method that creates and starts a thread.
    public static MyMultipleThread createAndStart(String name) {
        MyMultipleThread myThrd = new MyMultipleThread(name);

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

class MoreThreads{
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyMultipleThread mt1=MyMultipleThread.createAndStart("Child #1");
        MyMultipleThread mt2 = MyMultipleThread.createAndStart("Child #2");
        MyMultipleThread mt3 = MyMultipleThread.createAndStart("Child #3");

        for (int i = 0; i <50 ; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException exc){
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending.");
    }
}
