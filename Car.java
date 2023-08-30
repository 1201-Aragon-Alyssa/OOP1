class Car extends Vehicle
{
    private String make, model;
    private int numWheels;

    public Car(String make, String model, Wheel wheelType, int numWheels)
    {
        super(wheelType);
        this.make = make; 
        this.model = model; 
        this.numWheels = numWheels;
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
        return "Car \n\tMake: " + make + "\n\tModel: " + model + "\n\tWheel: " + wheelType;
    }
}