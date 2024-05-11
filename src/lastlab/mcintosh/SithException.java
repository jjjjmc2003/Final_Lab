package lastlab.mcintosh;

// Define a custom exception class named SithException that extends the Exception class.

public class SithException extends Exception{
    // Implement a constructor that takes a String message as a parameter and passes it to the superclass constructor.
    public SithException(String message) {
        super(message); // Pass the message to the Exception constructor
    }
}
