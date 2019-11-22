package multithreading.synchronizarion.waitAndNotify;

// Use wait() and notify() to create a ticking clock
class TickTock {
    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { //stop the clock
            state = "ticked";
            notify(); //notify any waiting threads
            return;
        }

        System.out.println("Tick ");

        state = "ticked"; //set the current state to ticked

        notify(); //let tock() run
        try {
            while (!state.equals("tocked"))
                wait();//
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { //stop the clock
            state = "tocked";
            notify(); //notify any waiting threads

            System.out.println("Tock");

            state = "tocked"; //set the current state to tocked

            notify(); //let tick() run //tock() notifies tick()
            try {
                while (!state.equals("ticket")) {
                    wait(); //wait for tick to complete (tock() waits for tick() )
                }
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
