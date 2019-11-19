package multithreading;

class MyThread implements Runnable { // Objects of MyThread can be run in their own threads because MyThread implements Runnnable
    String thrName;
    MyThread(String name) {
        thrName = name;
    }

    // Entry point of thread.
    public void run() {  //thread starts executing here
        System.out.println(thrName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrName + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrName + " interrupted.");
        }
        System.out.println(thrName + " terminating");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        //First, construct a MyThread object.
        MyThread mt = new MyThread("Child #1"); //Create a runnable object

        //Next, construct a thread from that object.
        Thread newThrd = new Thread(mt); //Construct a thread on that object

        //Finally, start execution of the thread.
        newThrd.start(); //start running the thread

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