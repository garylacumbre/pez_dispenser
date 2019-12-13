
// A class is used as a blueprint for creating an object. This object can now be used to create a programme
class PezDispenser {
  public static final int MAX_PEZ = 12; //Creates the maximum number of pez in the dispenser. Final makes it constant. Static means it is availbe in Example.java directly from the class
  final private String characterName; // private means the variable cannot be accessed from outside of the class and final means once set it cannot be changed
  private int pezCount; // Creates a variable to count number of Pez in the dispenser
  
  public PezDispenser(String characterName) { // A constructor that allows the characterName to be set on creating a new instance of the object. Constructors have the same name as the class
    this.characterName = characterName;
    pezCount = 0; // Makes it available as an instance of PezDispenser by placing it in the constructor
  }
  
  // Creates a method to check if the dispenser is empty
  public boolean isEmpty() {
    return pezCount == 0;
  }
  
    // Creates a method to fill the dispenser to the maximum
  public void fill() {
    fill(MAX_PEZ); // This now calls the fill method below and fills the dispenser to MAX - it knows to call the method below because of the parameter. When this fill method is called it it turn called second fill method. So whether there is 0 pez or another amount it will still be filled to 12 when this is called. 
  }
  
  // Create a fill method that takes in the amount of pez and fills to 12
  public void fill(int pezAmount) {
    int newAmount = pezCount += pezAmount;
    if (newAmount > MAX_PEZ) {
      throw new IllegalArgumentException("Too many PEZZZ!!!");  // Exception will throw an error and exit the programme
    }
    pezCount = newAmount;
  }
  
  // Create a method to dispense the Pez in increments
  public boolean dispense() {
    boolean wasDispensed = false;
    if (!isEmpty()) { //If the dispenser is not empty dispense pez by decrementing by one
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
  
  // Creates a method that pulls the variable from the class object and makes it accessible 
  public String getCharacterName() {
    return characterName;
  }
  
}

// 1. Create the class for the object & create a variable within the class - PexDispenser.java
// 2. Create a new instance of the class object and print it to the screen using the name of the new instance with the name of the class variable - Example.java
// 3. Set the modifier to private to protect the class from being changed - PezDispenser.java
// 4. Create the method for calling the object class within the scope of the new object - PezDispenser.java
// 5. Call that method instead of the class variable - Example.java
// 6. Create the constructor to allow the consumer to determine the name of the dispenser - PezDispsener.java
// 7. Set the name for the instance of the object - Example.java
// 8. Set the maximum number number of Pez for the dispenser and set it as a constant, accessible directly from the class object - PezDispenser.java
// 9. Call the MAX-PEZ variable into the instance of the object - Example.java
// 10. Create a variable for the number of Pez in the dispenser - PezDispenser.java
// 11. Set the initial pezCount to 0 when it is first instantiated inside the constructor - PezDispenser.java
// 12. Create a method to fill the dispenser and set it equal to MAX-PEZ - PezDispenser.java
// 13. Call the fill method into the instance of the object - Example.java
// 14. Create a method that checks if the dispenser is empty - PezDispenser
// 15. Call the isEmpty method and display text IF the condition is true - Example.java
// 16. Call the isEmpty method and display text IF the condition is not true - Example.java
// 17. Create a method to dispense the pez in increments of one - PezDispenser.java
// 18. Call the dispense method in a loop until the dispenser it empty - Example.java
// 19. Create a fill method that takes in the amount of pez and fills to 12 - PezDispenser.java
// 20. Call the new fill method this time time filling it with a specific number of pez, then empty the dispenser again - Example.java
// 21. Create an exception to ensure the dispenser cannot be overloaded/filled - PezDispenser.java
// 22. Create a try catch block to allow the programme to handle an exception and then continue - Example.java
