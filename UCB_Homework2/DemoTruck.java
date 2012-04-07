//subclass of Auto
//has two set() methods that override Auto's set()
//has one display() method that overrides Auto's display()
class Truck extends Auto {

  //constructor calls Auto constructor, passing in 
  //an "owner" and the autoType "truck"  
  Truck(String owner) {
    super(owner, "truck");
  }

  void setGasTankSize(int tank) {
    this.gasTankSize = tank * 3;
  }
  
  void setMaxSpeed(int speed) {
    this.maxSpeed = speed/2;
  }

  //alerts user that object is a truck
  //then calls Auto's displayAllInfo method
  void displayAllInfo() {
    System.out.println("Truck time!");
    super.displayAllInfo();
  }

}

class DemoTruck {

  //calls Truck constructor, sets gas tank size and max speed
  //displays all info
  public static void main(String[] args) {
    Truck pickup = new Truck("Hannah");
    pickup.setGasTankSize(1000);
    pickup.setMaxSpeed(39);  
    pickup.displayAllInfo();
  }

}
