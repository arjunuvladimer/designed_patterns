package Factory;

abstract class Aircraft {
    public abstract int getEngine();

    public String toString(){
        return "Engine:"+this.getEngine();
    }
}

class BoeingNew extends  Aircraft{
    int engine;

    BoeingNew(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return this.engine;
    }
}

class F16 extends  Aircraft{
    int engine;

    F16(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return this.engine;
    }
}

class Cesna extends  Aircraft{
    int engine;

    Cesna(int engine){
        this.engine = engine;
    }

    @Override
    public int getEngine() {
        return this.engine;
    }
}

class AircraftFactory{
    public static Aircraft getInstance(String type, int engine){
        if(type=="Boeing"){
            return new BoeingNew(engine);
        }else if(type == "F16"){
            return new F16(engine);
        }else if(type == "Cesna"){
            return new Cesna(engine);
        }
        return null;
    }
}


public class FactoryImplementation{
    public static void main(String[] args){
        Aircraft boeing = AircraftFactory.getInstance("Boeing",2);
        System.out.println(boeing);
        Aircraft boeing1 = AircraftFactory.getInstance("Boeing",2);
        System.out.println(boeing);

    }
}

// Class
// Blue Yonder

// Sub Class
// 1. CommerceNew
// 2. Logistics
// 3. Warehouse

// Factory Class BlueYonderFactory
// CommerceNew


// Implementations => Client Classes
// Order Management System { Commerce , Logistics, Warehouse} // Independent
// Order Fullfillment System { Commerce , Logistics} // Independent
// Transportation Management System { Commerce , Logistics, Warehouse} // Independent




