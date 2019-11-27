package chapter12.enumeration;

import javax.swing.table.TableRowSorter;

class TrafficLightDemo {
}

//An enumeration of the colors of a traffic light
enum TrafficLightColor{
    RED, GREEN, YELLOW
}

//A computerized traffic light
class TrafficLightSimulator implements Runnable{
    private TrafficLightColor tlc; //holds the traffic light color
    private boolean stop = false; //set to true to stop the simulation
    private boolean changed = false; //true when the light has changed

    TrafficLightSimulator (TrafficLightColor init){
        tlc=init;
    }

    TrafficLightSimulator (){
        tlc=TrafficLightColor.RED;
    }


    // Start up the light.
    public void run(){
        while (!stop){
            try{
                switch (tlc){
                    case GREEN:
                        Thread.sleep(10000); //green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (tlc){
            case RED:
                tlc=TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc=TrafficLightColor.RED;
                break;
            case GREEN:
                tlc= TrafficLightColor.YELLOW;
        }
        changed=true;
        notify(); //signal that the light has changed
    }


}