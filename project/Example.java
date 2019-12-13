public class Example {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a PEZ Dispenser");
    System.out.printf("FUN FACT: There are %d Pez allowed in every dispenser \n",
                      PezDispenser.MAX_PEZ
                     ); // Calls the MAX-PEZ variable directly from the class
    
    //This is calling the object class 'PezDispenser' that was created in PezDispenser.java and creates a new instance of this object
    PezDispenser dispenser = new PezDispenser("Yoda"); // Yoda referes back to the PezDispenser constructor and its variable of 'name'
    System.out.printf("The dispenser is %s %n", 
                      dispenser.getCharacterName()
                     ); // Prints the sentence with the getCharacterName method contained within the object
    
    // A conditional that notifies the user if the dispenser is empty
    if (dispenser.isEmpty()) {
      System.out.println("Dispenser is empty.");
    }
    
    System.out.println("Filling the dispenser with delicious PEZ...");
    dispenser.fill(); // Calls the method in order to fill the dispenser to MAX_PEZ
    
    // A conditional that checks and tells the user if the dispenser is not empty
    if (!dispenser.isEmpty()) {
      System.out.println("Dispenser is full.");
    }
    while (dispenser.dispense()) {
      System.out.println("Chomp!");
    }
    if (dispenser.isEmpty()) {
      System.out.println("Ate all the pez!");
    }
    
    dispenser.fill(6);
    dispenser.fill(2);
    while (dispenser.dispense()) {
      System.out.println("Chomp!!");
    }
    try {
        dispenser.fill(101);
    } catch (IllegalArgumentException iae) {
      System.out.println("Hold on there!!!!");
      System.out.printf("The error was %s %n",
                          iae.getMessage() 
                        );
    }
  }
} 