package multithreading;

// Demonstrate thread priorities
class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    //Construct a new thread.
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    //Entry point of thread
    public void run() {
        System.out.println(thrd.getName() + " starting ");
        do {
            count++;
            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000); //The first thread to 10000000 stops all threads
        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating");
    }
}

class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        Priority mt3 = new Priority("Normal Priority #1");
        Priority mt4 = new Priority("Normal Priority #2");
        Priority mt5 = new Priority("Normal Priority #3");

        //set the priorities
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2); //Give mt1 a higher priority than mt2
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        //start the threads
        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        try {
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " + mt1.count);
        System.out.println("\nLow priority thread counted to " + mt2.count);
        System.out.println("1st Normal priority thread counted to " + mt3.count);
        System.out.println("2nd Normal priority thread counted to " + mt4.count);
        System.out.println("3rd Normal priority thread counted to " + mt5.count);

    }
}
