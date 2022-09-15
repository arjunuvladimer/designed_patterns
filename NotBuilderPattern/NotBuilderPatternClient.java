package NotBuilderPattern;



class Aircraft{
    // Required Parameters
    // 1. Engine
    // 2. Wheels
    private String engine;
    private int wheel;

    // Optional Parameters
    // 3. FoodService
    private int food;

    public Aircraft(String engine, int wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}




public class NotBuilderPatternClient{

    public static  void main(String[] args){



        Aircraft boeing = new Aircraft("Dual Engine", 8);

        Aircraft F16 = new Aircraft("Single Engine", 2 );


    }
}







