package Singleton;

public class AircraftSynchronized {
    private  static AircraftSynchronized instance;

    private AircraftSynchronized(){}

//    public static synchronized AircraftSynchronized getInstance(){
//        if(instance == null){
//            instance =  new AircraftSynchronized();
//        }
//        return instance;
//    }

    public static AircraftSynchronized getInstance(){
        if(instance == null){
            synchronized (AircraftSynchronized.class){
                instance =  new AircraftSynchronized();
            }
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }
}

class Client3{
    public static void main(String args[]){
        AircraftSynchronized obj1 = AircraftSynchronized.getInstance();
        obj1.fly();
        AircraftSynchronized obj2 = AircraftSynchronized.getInstance();
        obj2.fly();
    }
}
