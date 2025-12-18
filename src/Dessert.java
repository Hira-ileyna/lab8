public class Dessert extends Food{
    private boolean containsSugar;
    public Dessert(String name, int price, boolean containsSugar) {
        super(name, price);
        this.containsSugar = containsSugar;
    }
    @Override
    public void describe(){
        System.out.println("Dessert name: " + this.name + " price: " + this.price + " contains sugar: " + this.containsSugar);
    }

}
