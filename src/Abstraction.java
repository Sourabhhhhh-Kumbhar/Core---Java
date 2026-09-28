abstract class FoodOrder {

    // Abstract method
    abstract void prepareFood();

    // Normal method
    void orderPlaced()
    {
        System.out.println("Food order placed successfully");
    }
}

class PizzaOrder extends FoodOrder {

    @Override
    void prepareFood()
    {
        System.out.println("Preparing Pizza with cheese and toppings");
    }
}

class BurgerOrder extends FoodOrder {

    @Override
    void prepareFood()
    {
        System.out.println("Preparing Burger with vegetables and sauce");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        FoodOrder order;

        order = new PizzaOrder();
        order.orderPlaced();
        order.prepareFood();

        order = new BurgerOrder();
        order.orderPlaced();
        order.prepareFood();
    }
}