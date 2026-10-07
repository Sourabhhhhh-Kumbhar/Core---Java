class DirectRecursion {

    void direct(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Direct Recursion: " + n);
        direct(n - 1);
    }
}

class IndirectRecursion {

    void methodA(int n) {

        if (n <= 0) {
            return;
        }

        System.out.println("Method A: " + n);
        methodB(n - 1);
    }

    void methodB(int n) {

        if (n <= 0) {
            return;
        }

        System.out.println("Method B: " + n);
        methodA(n - 1);
    }
}

public class DirectAndIndirectRecursion {
    public static void main(String[] args) {

        DirectRecursion obj1 = new DirectRecursion();
        IndirectRecursion obj2 = new IndirectRecursion();

        System.out.println("=== Direct Recursion ===");
        obj1.direct(5);

        System.out.println("\n=== Indirect Recursion ===");
        obj2.methodA(5);
    }
}