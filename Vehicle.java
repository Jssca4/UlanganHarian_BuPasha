public class Vehicle {
  int numWheels;
  static double price;

  public Vehicle() {

  }

  public Vehicle(int numWheels, double price) {
    numWheels = 0;
    price = 0;
  }

  public int getnumWheels() {
    return this.numWheels;
  }

  public void setnumWheels(int numWheels) {
    this.numWheels = numWheels;
  }

  public double getprice() {
    return this.price;
  }

  public void setprice(double price) {
    this.price = price;
  }

  public void print() {
    System.out.println("numWheels :" + numWheels);
    System.out.println("price :" + price);

  }

}
