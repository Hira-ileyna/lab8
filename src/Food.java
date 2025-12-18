public class Food {
    protected String name;
    protected double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getInfo(){
        return this.name;
    }
    public void describe(){
        System.out.println("Food name: " + this.name + " price: " + this.price);
    }
}
