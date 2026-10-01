public class ThreeDArray
{
    void display()
    {
        int [][][] numbers = {
                {
                        {1 , 2},
                        {2 , 3}
                },
                {
                        {5 , 6},
                        {7 , 8}
                }
        };

        System.out.println("3D Array Elements:");

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                for(int k = 0; k < numbers[i][j].length; k++)
                {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        ThreeDArray obj = new ThreeDArray();
        obj.display();
    }
}
