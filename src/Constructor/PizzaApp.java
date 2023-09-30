package Constructor;

public class PizzaApp {
    public static void main(String[] args) {
//        Pizza pizza = new Pizza(false);
//       pizza.AddTpCheese();
//       pizza.AddTpMeal();
//       pizza.getBill();

        Pizza pizza = new Pizza(true);
        pizza.AddTpCheese();
        pizza.getBill();
        System.out.println("===================");
        pizza = new DeluxePizza(true);
        pizza.AddTpCheese();
        pizza.AddTpCheese();
        pizza.getBill();
    }
}
