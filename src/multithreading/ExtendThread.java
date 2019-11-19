package multithreading;

class ExtendThread {
    class MyThread extends Thread {
        // Construct a new thread.
        MyThread(String name) {
            //name thread. Super is used to call this version of Thread's constructor:
            //Thread(String threadName)
            super(name);
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
}
