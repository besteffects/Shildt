package chapter12.enumeration.valueOf;

// Use built-in enumeration methods
// An enumeration of Transport varieties
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Here are all transport constants");

        //use values()
        Transport allTransports[] = Transport.values(); //Obtain an array of Transport constants
        for (Transport t : allTransports) {
            System.out.println(t);
        }
  /* allTransports can be eliminated by following code:
  for(Transport s :Transport.values()){
  System.ou.println(t)  */
        System.out.println();

        //use valueOf()
        tp = Transport.valueOf("AIRPLANE"); //Obtain the constant with the name AIRPLANE
        System.out.println("tp contains " + tp);

    }
}
