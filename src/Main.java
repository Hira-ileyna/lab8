//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    MainDish dish = new MainDish("Pasta", 120,true);
    Dessert dessert = new Dessert("San Sebastian", 200,true);
    Drink drink = new Drink("Tea", 40,false);

    dish.describe();            //Overridden method
    dessert.describe();         //Overridden method
    drink.describe();           //Overridden method
    }
}