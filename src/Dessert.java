public class Dessert extends Food{
    private boolean containsSugar;
    public Dessert(String name, int price, boolean containsSugar) {
        super(name, price);
        this.containsSugar = containsSugar;
    }
    @Override
    public void describe(){
        System.out.print("Dessert: " + getInfo());
        if(containsSugar){
            System.out.println(" (With sugar) ");
        }else  {
            System.out.println(" (Sugar Free) ");
        }
    }

}
