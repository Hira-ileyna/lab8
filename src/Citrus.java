public class Citrus extends Fruit{
    private double vitaminCmg;
    public Citrus(String name, double calories, double vitaminCmg){
        super(name, calories);
        this.vitaminCmg = vitaminCmg;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println(" Vitamin C info");
    }
}
