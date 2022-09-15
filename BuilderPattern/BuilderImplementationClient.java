package BuilderPattern;

class Aircraft{
    // Required Parameters
    // 1. Engine
    // 2. Wheels
    private String engine;
    private int wheel;

    // Optional Parameters
    // 3. FoodService
    private boolean food;

    public Aircraft(AircraftBuilder aircraftBuilder) {
        this.engine = aircraftBuilder.engine;
        this.wheel = aircraftBuilder.wheel;
        this.food = aircraftBuilder.food;
    }

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public boolean isFood() {
        return this.food;
    }

    public static class AircraftBuilder{
        private String engine;
        private int wheel;

        private boolean food;

        public AircraftBuilder(String engine, int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }

        public AircraftBuilder setFood(boolean food){
            this.food = food;
            return this;
        }

        public Aircraft build(){
            return new Aircraft(this);
        }
    }

}




public class BuilderImplementationClient{

    public static  void main(String[] args){
        String s = "Hello World";
        s.concat("How are you");

        // Erase the old Hello World and Create Hello World How are you
        // Hello World Changed on old
        System.out.println(s);
        Aircraft boeing = new Aircraft.AircraftBuilder("Dual Engine", 8).setFood(true).build();
        System.out.println(boeing);

        Aircraft F16 = new Aircraft.AircraftBuilder("Single Engine", 2).build();
        System.out.println(F16);


//        Aircraft boeing = new Aircraft("Dual Engine", 8, true);

//        Aircraft F16 = new Aircraft("Single Engine", 2, null);


    }
}







