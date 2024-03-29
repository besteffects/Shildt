package multithreading.usingMainThread;

/*
11-2
Controlling the main thread
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        //Get the main thread.
        thrd = Thread.currentThread();


        //Display main thread's name.
        System.out.println("Main thread is called: " + thrd.getName());

        //Display main thread's priority
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        //Set the name and priority.
        System.out.println("Setting name and priority");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("Main thread is called: " + thrd.getName());
        System.out.println("Priority is now: " + thrd.getPriority());
    }
}
