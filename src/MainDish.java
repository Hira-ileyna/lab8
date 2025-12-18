public class MainDish extends Food{
    private boolean spicy;
    public MainDish(String name, int price, boolean spicy){
        super(name, price);
        this.spicy = spicy;
    }
    @Override
    public void describe(){
        System.out.println("Main Dish name: " + this.name + " price: " + this.price + " spicy: " + this.spicy);
    }
}
