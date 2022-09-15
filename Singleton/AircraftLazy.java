package Singleton;

// Lazy Instatiation

public class AircraftLazy {

    // 1. So that instance created at load time
    // 2. private member -> No Outside class can access it to create instance
    // 3. static -> Inside AircraftEagar class you don't want any kind of new instance be loaded
    private  static AircraftLazy instance;

    private AircraftLazy(){}

    public static AircraftLazy getInstance(){
        if(instance == null){
           instance =  new AircraftLazy();
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }
}

class Client2{

    public static void main(String args[]){

        AircraftLazy obj1 = AircraftLazy.getInstance();
        obj1.fly();
        AircraftLazy obj2 = AircraftLazy.getInstance();
        obj2.fly();

    }
}

// Session
// Gmail
// => Gmail arjunUser = new Gmail() => 124
// => arjunUser.login() => Typed in Password, Username
// Sessions[Expiry time[1 Day] for Instance Close] => They keep a track of Instance Creation
// Arjun got logged in @ 15th Sep 9:00 => Saves session time in memory
// For more than a day Session Time gets expired and wheneven I try a new Instance would be created
// It tries to access the old instance
// => Closed Browser


// => Gmail michaelUser = new Gmail()
// Cache => Stores Username, Debit Card Details