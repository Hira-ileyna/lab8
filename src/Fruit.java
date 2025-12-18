public class Fruit {
    protected String name;
    protected double calories;
    public Fruit(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    public String getInfo(){
        return "Name: " + name + ", Calories: " + calories;
    }
    public void describe(){
        System.out.println("This fruit is " + getInfo());
    }
}
