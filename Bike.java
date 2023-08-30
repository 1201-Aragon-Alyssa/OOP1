class Bike extends Vehicle
{
    private String material, type;

    public Bike(String material, String type, Wheel wheelType)
    {
        super(wheelType);
        this.material = material; 
        this.type = type;
    }
    
    public void pedal(){
        System.out.println("Pedaling");
    }

    public void RingBell(){
        System.out.println("Ring ring");
    }

    public String getMaterial(){
        return material; 
    }
    public void setMaterial(String newMaterial){
        material = newMaterial; 
    }

    public String getType(){
        return type; 
    }
    public void setType(String newType){
        type = newType; 
    }

    public String toString()
    {
        return "Bike\n\tMaterial: " + material + "\n\tType: " + type + "\n\tWheel: " + wheelType;
    }
}