public class MainDish extends Food{
    private boolean spicy;
    public MainDish(String name, int price, boolean spicy){
        super(name, price);
        this.spicy = spicy;
    }
    @Override
    public void describe(){
        System.out.print("Main Dish: " + getInfo() );
        if(spicy){
            System.out.println(" (Spicy) ");
        }else {
            System.out.println(" (Not Spicy) ");
        }
    }
}
