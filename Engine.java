public class Engine {
    int cylinders, horsepower;

    public Engine(int cylinders, int horsepower) {
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    public String toString()
    {
        return cylinders + " cylinder " + horsepower + " hp";
    }
}
