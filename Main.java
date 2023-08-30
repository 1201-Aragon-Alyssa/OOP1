class Main
{
    public static void main(String []args)
    {
        Wheel myWheel = new Wheel("Rubber");
        Vehicle myCar = new Car("Chevy", "Sinota", myWheel, 4);
        System.out.println(myCar);

        Vehicle myBike = new Bike("Aluminum", "Cruiser", myWheel);
        System.out.println(myBike);
    }
};
