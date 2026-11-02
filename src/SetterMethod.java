public class SetterMethod
{
    private String name;
    private int age;

    //Setter for name: updates the private field with the given value
    public void setName(String name)
    {
        //"this" separates the field from the parameter with the same name
        this.name = name;
    }

    //Setter for age
    public void setAge(int age)
    {
        //Validation inside a setter is a key benefit of encapsulation
        if(age > 0)
        {
            this.age = age;
        }
    }

    public static void main(String[] args)
    {
        SetterMethod setter = new SetterMethod();

        //Set values through setters
        setter.setName("Sourabh");
        setter.setAge(24);

    }
}