// Demonstrates the if-else if ladder in Java
public class IfElseIf
{
    // Method that checks the marks and prints the matching grade
    void checkGrade()
    {
        // Stores the student's marks
        int marks = 76;

        // Conditions are checked from top to bottom;
        // the first one that is true runs, and the rest are skipped

        // Checks if marks are 90 or above
        if (marks >= 90)
        {
            System.out.println("Grade A");
        }
        // Runs only if the first condition was false
        // Checks if marks are 75 or above (so effectively 75 to 89 here)
        else if (marks >= 75)
        {
            // Runs because 76 >= 75 is true
            System.out.println("Grade B");
        }
        // Checks if marks are 50 or above (effectively 50 to 74)
        else if (marks >= 50)
        {
            System.out.println("Grade C");
        }
        // Checks if marks are 40 or above (effectively 40 to 49)
        else if (marks >= 40)
        {
            System.out.println("Fail");
        }
        // Note: there is no final else, so marks below 40 print nothing
    }

    // Entry point of the program
    public static void main(String[] args)
    {
        // Create an object of the IfElseIf class
        IfElseIf obj = new IfElseIf();

        // Call checkGrade() to run the grade check
        obj.checkGrade();
    }
}