package lastlab.mcintosh;

import java.util.ArrayList;

public class SithFactory {
    // Declare a static instance variable to hold the single instance of SithFactory.
    private static SithFactory instance = null;

    // A list to keep track of all the Siths created
    private ArrayList<Sith> siths = new ArrayList<>();

    // Variable to keep track of the current SithCount.
    private int sithCount = 0;

    // Private constructor to prevent direct instantiation from outside the class.
    private SithFactory() {}

    // Public static method that provides global access to the single instance.
    public static synchronized SithFactory getInstance() {
        if (instance == null) {
            instance = new SithFactory();
        }
        return instance;
    }

    // Attempts to create a new Sith with the specified name.
    public Sith createSith(String name) throws SithException {
        synchronized (this) {
            // Check if the current count of Sith is at its maximum allowed value of two.
            if (sithCount >= 2) {
                // If there are already two Sith, throw a SithException indicating that no more Sith can be created.
                throw new SithException("No more than 2 Sith can exist at the same time");
            }
            // If the count is less than two, proceed to create a new Sith.
            Sith newSith = new Sith(name);
            System.out.println(name + " has been created!");
            // Increment the count of Sith as we have successfully created a new one.
            sithCount++;
            // Add the new Sith to the list of Siths
            siths.add(newSith);
            // Alert other Siths about the new Sith
            notifySiths(name);
            // Return the newly created Sith object.
            return newSith;
        }
    }


    // Decrement the sithCount when a Sith is eliminated.
    public void decreaseSithCount() {
        sithCount--;
    }

    // Notifies all Siths about an event, such as the creation of a new Sith.
    public void notifySiths(String name) {
        for (Sith sith : siths) {
            sith.update(name);
        }
    }
}
