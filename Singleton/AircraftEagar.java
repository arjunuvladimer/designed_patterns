package Singleton;

// Eagar/ Early Instatiation

public class AircraftEagar {

   // 1. So that instance created at load time
   // 2. private member -> No Outside class can access it to create instance
   // 3. static -> Inside AircraftEagar class you don't want any kind of new instance be loaded
   private  static AircraftEagar instance =  new AircraftEagar();;

   private AircraftEagar(){}

   public static AircraftEagar getInstance(){

       return instance;
   }

   public void fly(){
       System.out.println("Flying some Aircraft");
   }
}

class Client{

    public static void main(String args[]){

        AircraftEagar obj1 = AircraftEagar.getInstance();
        obj1.fly();
        AircraftEagar obj2 = AircraftEagar.getInstance();
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