class Payment
{
    public void pay()
    {
        System.out.println("Making a payment");
    }
}

class UPI extends Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment done using UPI");
    }
}

class CreditCard extends Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment done using Credit Card");
    }
}

class Cash extends Payment
{
    @Override
    public void pay()
    {
        System.out.println("Payment done using Cash");
    }
}

public class RuntimePolymorphism
{
    public static void main(String[] args)
    {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new Cash();
        p.pay();
    }
}