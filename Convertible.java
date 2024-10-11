public class Convertible extends Car {
  String roofType;
  public int discount;

  public Convertible() {
    super();
    roofType = "";
  }

  public Convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
    super(numWheels, price, numDoors, isElectric);
    this.roofType = roofType;
  }

  public String getroofType() {
    return this.roofType;
  }

  public void setroofType(String roofType) {
    this.roofType = roofType;
  }

  public void print() {
    super.print();
    System.out.println("roofType :" + roofType);

  }
}