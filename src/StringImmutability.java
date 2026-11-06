public class StringImmutability
{
    public static void main(String[] args)
    {
        String s1 = "Java";                 //Goes into the String pool
        String s2 = "Java";                 //Reuses the same pooled object
        String s3 = new String("Java");         //Forces a new object on the heap

        System.out.println(s1 == s2);               //True, same reference from pool
        System.out.println(s1 == s3);               //False, different objects
        System.out.println(s1.equals(s3));          //True, content is same

        String s4 = s1.toLowerCase();               //Creates a New string, s1 is unchanged
        System.out.println(s1);                     //Java
        System.out.println(s4);                     //java

        String s5 = s3.intern();                    //Returns the pooled version
        System.out.println(s1 == s5);               //true
    }
}
