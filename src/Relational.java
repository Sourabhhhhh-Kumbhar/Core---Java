class Relational
{

    void compare() {
        int a = 20;
        int b = 10;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }

    public static void main(String[] args) {

        Relational obj = new Relational();
        obj.compare();
    }
}