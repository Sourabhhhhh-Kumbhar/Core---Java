public class Demo2
{
    // INSTANCE VARIABLE (field): belongs to each object of Demo2.
    // Every method of this class can use it.
    // (Not private here, so any other class could change it directly.
    // Better practice is "private int balance = 200;" for encapsulation.)
    int balance = 200;

    // A normal (non-static) method, so it needs an object to be called.
    void add()
    {
        // LOCAL VARIABLE: exists only inside this method.
        // It is legal to name it "add" (same as the method name), but confusing.
        // balance + 500 = 200 + 500 = 700
        int add = balance + 500;
        System.out.println(add);   // 700

        // NOTE: "balance" itself is NOT changed. We only stored the
        // calculated value in the local variable "add".
    }

    void sub()
    {
        // 200 - 200 = 0
        // balance is still 200 here, because add() didn't modify it.
        int sub = balance - 200;
        System.out.println(sub);   // 0
    }

    // BUG: the correct entry point is main(String[] args).
    // Your main() has NO parameters, so the JVM doesn't recognize it
    // as the starting point and the program won't run.
    // Fix: public static void main(String[] args)
    public static void main(String[] args)
    {
        // add() and sub() are not static, so we must create an object first
        Demo2 demo = new Demo2();

        demo.add();   // prints 700
        demo.sub();   // prints 0
    }
}