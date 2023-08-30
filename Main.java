class Main
{
    public static void main(String []args)
    {
        Wheel myWheel = new Wheel("Rubber");
        Engine myEngine = new Engine(6, 2000);
        Vehicle myCar = new Car("Chevy", "Sinota", myWheel, 4, myEngine);
        System.out.println(myCar);

        Vehicle myBike = new Bike("Aluminum", "Cruiser", myWheel);
        System.out.println(myBike);
    }
};
