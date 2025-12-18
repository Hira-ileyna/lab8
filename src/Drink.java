public class Drink extends Food {
    private boolean cold;
    public Drink(String name, int price, boolean cold) {
        super(name, price);
        this.cold = cold;
    }

    @Override
    public void describe(){
        System.out.println("Drink name: " + this.name + " price: " + this.price + " cold: " + this.cold);
    }
}
