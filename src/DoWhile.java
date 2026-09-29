public class DoWhile
{
    void display()
    {
        int i = 1;

        do
        {
            System.out.println(i++);
            i++;
        }
        while(i<10);
    }

    public static void main(String[] args)
    {
        DoWhile obj = new DoWhile();
        obj.display();
    }
}
