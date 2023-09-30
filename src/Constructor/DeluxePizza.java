package Constructor;

public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean basePizza) {
        super(basePizza);
        super.AddTpCheese();
        super.AddTpMeal();
    }

    @Override
    void AddTpCheese() {

    }

    @Override
    void AddTpMeal() {

    }
}
