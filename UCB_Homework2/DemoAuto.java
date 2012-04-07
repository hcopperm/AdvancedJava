//Auto class has four instance variables
//two constructors; one takes two args and one takes none
//has set() and display() methods for all instance variables
class Auto {
  String ownerName;
  String autoType;
  int maxSpeed;
  int gasTankSize;

  Auto(String owner, String autoType) {
    this.ownerName = owner;
    this.autoType = autoType;
  }

  Auto() {
    super();
  }  

  void displayAllInfo() {

    displayOwnerName();
    displayAutoType();
    displayMaxSpeed();
    displayGasTankSize();
    
  }

  void setOwnerName(String ownName) {
    this.ownerName = ownName;
  }

  void setAutoType(String auType) {
    this.autoType = auType;
  }

  void setMaxSpeed(int speed) {
    this.maxSpeed = speed;
  }

  void setGasTankSize(int gtank) {
    this.gasTankSize = gtank;
  }

  void displayOwnerName() {
    System.out.println("Owner: " + this.ownerName);
  }

  void displayAutoType() {
    System.out.println("Type: " + this.autoType);
  } 

  void displayMaxSpeed() {
    System.out.println("Max speed: " + this.maxSpeed);
  }
  
  void displayGasTankSize() {
    System.out.println("Gas tank size: " + this.gasTankSize);
  }

}

class DemoAuto {
  
  //creates a new Auto using constructor that takes two args, sets info, and displays it.
  //then creates a new Auto using constructor that takes no args, sets info, and displays it.
  public static void main(String[] args) {
    Auto iceCreamTruck = new Auto("Hannah", "food truck");
    iceCreamTruck.setMaxSpeed(2);
    iceCreamTruck.setGasTankSize(5);
    iceCreamTruck.displayAllInfo(); 
    Auto golfCart = new Auto();
    golfCart.setOwnerName("Jeff");
    golfCart.setAutoType("golf cart");
    golfCart.setMaxSpeed(9);
    golfCart.setGasTankSize(1);
    golfCart.displayAllInfo();
  }


}
