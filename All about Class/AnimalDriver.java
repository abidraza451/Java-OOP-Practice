public class AnimalDriver {
    public static void main(String[] args) {
        Animal A1=new Animal();

        
        A1.setValues("Tiger", "Panthera tigris", 8, 220.5, "Orange with Black Stripes", "Forest", false, "Carnivore");

        System.out.println("===================Animal Details Are===========================");
        A1.getDetails();

    }
}
