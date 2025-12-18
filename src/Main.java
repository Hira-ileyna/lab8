//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    MainDish dish = new MainDish("Pasta", 120,true);
    Dessert dessert = new Dessert("San Sebastian", 200,true);
    Drink drink = new Drink("Ayran", 40,true);

    dish.describe();
    dessert.describe();
    drink.describe();
    }
}