class Account
{
    //Parent class Method
    void details()
    {
        System.out.println("General Account Details");
    }
}

class SavingAccount extends Account
{
    //Overriding the parent class method
    @Override
    void details()
    {
        System.out.println("Saving Account Details");
    }
}

class CurrentAccount extends Account
{
    @Override
    void details()
    {
        System.out.println("Current Account Details");
    }
}

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        //Parent class reference can refer to child class objects
        Account acc;

        //Reference points to a SavingAccount object
        acc = new SavingAccount();
        acc.details();      //Calls SavingAccount's method at runtime

        //Reference now points to a CurrentAccount object
        acc = new CurrentAccount();
        acc.details();      //Calls CurrentAccount's object
    }
}