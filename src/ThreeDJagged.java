class ThreeDJagged {

    void display() {

        int[][][] numbers = {
                {
                        {1, 2},
                        {3, 4, 5}
                },
                {
                        {6},
                        {7, 8},
                        {9, 10, 11}
                }
        };

        System.out.println("3D Jagged Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        ThreeDJagged obj = new ThreeDJagged();
        obj.display();
    }
}