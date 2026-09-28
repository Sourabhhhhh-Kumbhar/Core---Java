// ABSTRACT CLASS: a class declared with "abstract" cannot be instantiated
// (you can't write new FoodOrder()). It acts as a common base for related
// classes and can hold both incomplete (abstract) and complete (normal) methods.
abstract class FoodOrder {

    // ABSTRACT METHOD: only the signature, no body.
    // Every non-abstract child class MUST override it and provide its own body.
    // This forces each type of food order to define how it is prepared.
    abstract void prepareFood();

    // NORMAL (concrete) METHOD: has a full body.
    // Child classes inherit it as-is, so common code is written only once
    // instead of being repeated in PizzaOrder and BurgerOrder.
    void orderPlaced()
    {
        System.out.println("Food order placed successfully");
    }
}

// "extends" means PizzaOrder inherits from FoodOrder.
// Since FoodOrder has an abstract method, PizzaOrder must implement
// prepareFood(), otherwise the compiler gives an error.
class PizzaOrder extends FoodOrder {

    // @Override tells the compiler we are overriding a parent method.
    // If the name or signature doesn't match, we get a compile error
    // instead of a silent bug.
    @Override
    void prepareFood()
    {
        System.out.println("Preparing Pizza with cheese and toppings");
    }
}

// Another child class, with its own version of prepareFood().
// orderPlaced() is inherited automatically, no need to rewrite it.
class BurgerOrder extends FoodOrder {

    @Override
    void prepareFood()
    {
        System.out.println("Preparing Burger with vegetables and sauce");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        // Reference variable of the PARENT (abstract) type.
        // We can't create a FoodOrder object, but this variable can point to
        // any child object. This is polymorphism.
        FoodOrder order;

        // Now it points to a PizzaOrder object
        order = new PizzaOrder();
        order.orderPlaced();   // inherited method from FoodOrder
        order.prepareFood();   // PizzaOrder's version runs (decided at runtime)

        // Same variable, now pointing to a BurgerOrder object
        order = new BurgerOrder();
        order.orderPlaced();   // same inherited method
        order.prepareFood();   // BurgerOrder's version runs this time
    }
}