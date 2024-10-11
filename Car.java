public class Car extends Vehicle {
  int numDoors;
  boolean isElectric;
  public int discount;

  public Car() {
    super();
    numDoors = 0;
    isElectric = false;
  }

  public Car(int numWheels, double price, int numDoors, boolean isElectric) {
    super(numWheels,  price );
    this.numDoors = numDoors;
    this.isElectric = isElectric;
  }

  public int numDoors() {
    return this.numDoors;
  }

  public void setnumDoors(int numDoors) {
    this.numDoors = numDoors;
  }

  public boolean getisElectric() {
    return this.isElectric;
  }

  public void setisElectric(boolean isElectric) {
    this.isElectric = isElectric;
  }

  public void print() {
    super.print();
    System.out.println("numDoors" + numDoors);
    System.out.println("isElectric" + isElectric);
  }

}
