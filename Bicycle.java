public class Bicycle  extends Vehicle{

    String bikeType;
    public int discount;

    public Bicycle() {
        super();
        bikeType = "";
    }

    public Bicycle(int numWheels, double price, int numDoors, String bikeType) {
        super(numWheels, price );
        this.bikeType = bikeType;
    }

    public String getbikeType() {
        return this.bikeType;
    }

    public void setbikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void print() {
        super.print();
        System.out.println("bikeType :" + bikeType);
       
        
    }
}
