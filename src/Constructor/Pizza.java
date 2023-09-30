package Constructor;

public class Pizza {
    private int price;

    private boolean basePizza;
    private int basePizzaPrice;

    private boolean isAddTopCheese = false;
    private boolean isAddTopMeal = false;

    public Pizza(boolean basePizza) {
        this.basePizza = basePizza;
        if (this.basePizza){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    private int AddToppingCheese = 100;
    private int AddToppingMeal = 150;



    void AddTpCheese(){
        isAddTopCheese = true;
        this.price += AddToppingCheese;

    }

    void AddTpMeal(){
        isAddTopMeal = true;
        this.price += AddToppingMeal;
    }

    void getBill(){
        String bill = "";
        System.out.println("Pizza : " + basePizzaPrice);
        if (isAddTopCheese){
            bill += "Extra Cheese in pizza " + AddToppingCheese + "\n";
        } if (isAddTopMeal) {
            bill += "Extra Meal in pizza " + AddToppingMeal + "\n";

        }
        bill += "Bill : $" + this.price + "";
        System.out.println(bill);
    }



}
