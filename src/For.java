public class For
{
    void display()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Number: " + i);
        }
    }

    public static void main(String[] args)
    {
        For obj = new For();
        obj.display();
    }
}
