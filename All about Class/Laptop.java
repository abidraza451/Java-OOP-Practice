public class Laptop {
    String brand;
    String model;
    int price;
    int ramSize;

    public Laptop(String brand,String model, int price, int ramSize){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ramSize=ramSize;
    }

    public void showSpecs(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Ram Size: "+ramSize);
    }
    
}
