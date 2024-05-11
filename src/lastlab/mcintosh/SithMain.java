package lastlab.mcintosh;

public class SithMain {
    public static void main(String[] args) {
        // Get the singleton instance of the SithFactory.
        SithFactory factory = SithFactory.getInstance();
        try {
            // Try to create Siths
            Sith sith1 = factory.createSith("Darth Sidious");
            Sith sith2 = factory.createSith("Darth Maul");
            Sith sith3 = factory.createSith("Darth Vader");
        } catch (SithException e) {
            // Handle the exception if the rule of two is violated
            System.out.println("**** THIS EXCEPTION SHOULD NOT HAPPEN SINCE THERE CAN ONLY BE 2 SITH!!! ****");
            System.out.println(e.getMessage());
        }
    }
}
