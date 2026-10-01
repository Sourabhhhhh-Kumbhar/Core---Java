public class TwoDArray
{
    void display()
    {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
        };

        System.out.println("2D Array Elements");

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        TwoDArray obj = new TwoDArray();
        obj.display();
    }
}