package lastlab.mcintosh;

// Class definition for the Sith type, which encapsulates the properties and behaviors of a Sith character.
public class Sith {
    // Private instance variable to store the name of the Sith.
    private String name;

    // Constructor of the Sith class that initializes a new Sith with a given name.
    public Sith(String name) {
        this.name = name;  // Setting the instance variable 'name' with the provided argument 'name'.
    }

    // Method to simulate the elimination of this Sith.
    public void eliminate() {
        // Access the singleton instance of SithFactory and call its decreaseSithCount method to decrement the count of Siths.
        SithFactory.getInstance().decreaseSithCount();
        // Print out a message indicating that this particular Sith has been eliminated.
        System.out.println(name + " has been eliminated!");
    }

    // Getter method for the name of the Sith.
    public String getName() {
        return name;  // Returns the value of the private instance variable 'name'.
    }

    // Method that gets called when a new Sith is created.
    public void update(String newName) {
        if (this.name.equals(newName)) {
            // Print a welcome message if the new Sith has the same name as this Sith.
            System.out.println("Welcome, " + newName + "!");
        } else {
            // Otherwise, print a message alerting that a new Sith has been created.
            System.out.println("Alert: " + newName + " has joined the Sith ranks!");
        }
    }
}
