public class Fruit {
    String name;
    String color;
    boolean isSeasonal;

    public Fruit(String name, String color, boolean isSeasonal){

        this.name=name;
        this.color=color;
        this.isSeasonal=isSeasonal;

    }

    public void describeFruit(){
        System.out.println("Fruit: "+ name);
        System.out.println("Color: "+ color);
        System.out.println("Seasonal: "+(isSeasonal ? "Yes" : "No"));

    
    }
    
}
