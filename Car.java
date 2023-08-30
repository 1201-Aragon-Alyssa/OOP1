class Car extends Vehicle
{
    private String make, model;
    private int numWheels;
    private Engine engine;

    public Car(String make, String model, Wheel wheelType, int numWheels, Engine engine)
    {
        super(wheelType);
        this.make = make; 
        this.model = model; 
        this.numWheels = numWheels;
        this.engine = engine;
    }

    public void Start()
    {
        System.out.println("Starting car..");
    }

    public void Drive(int miles){
        System.out.println("Driven " + miles + " miles");
    }

    public String getMake()
    {
        return make; 
    }
    public void setMake(String newMake)
    {
        make = newMake; 
    }

    public String getModel()
    {
        return model; 
    }
    public void setModel(String newModel)
    {
        make = newModel; 
    }

    public String toString()
    {
        return "Car \n\tMake: " + make + "\n\tModel: " + model + "\n\tWheel: " + wheelType + "\n\tEngine: " + engine;
    }
}