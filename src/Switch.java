// Demonstrates the switch statement in Java
public class Switch
{
    // Method that prints the name of the day based on its number
    void checkDay()
    {
        // Day number to check (1 = Monday ... 7 = Sunday)
        int day = 3;

        // switch compares the value of day against each case label
        // and jumps to the first one that matches
        switch(day)
        {
            // Runs if day is 1
            case 1:
                System.out.println("Monday");
                // break exits the switch so the next cases don't run
                break;

            // Runs if day is 2
            case 2:
                System.out.println("Tuesday");
                break;

            // Runs if day is 3 (this one matches, since day = 3)
            case 3:
                System.out.println("Wednesday");
                break;

            // Runs if day is 4
            case 4:
                System.out.println("Thursday");
                break;

            // Runs if day is 5
            case 5:
                System.out.println("Friday");
                break;

            // Runs if day is 6
            case 6:
                System.out.println("Saturday");
                break;

            // Runs if day is 7
            case 7:
                System.out.println("Sunday");
                break;

            // default runs when no case matches (like an else)
            // It is the last block, so it doesn't need a break
            default:
                System.out.println("Invalid day");
        }
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the Switch class
        Switch obj = new Switch();

        // Call checkDay() to run the switch
        obj.checkDay();
    }
}