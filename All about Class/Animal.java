public class Animal {
    String name;
    String species;
    int age;
    double weight;
    String color;
    String habitat;
    boolean isDomestic;
    String diet;

    public void setValues(String name,String species,int age,double weight,String color, String habitat,boolean isDomestic,String diet ){
        this.name=name;
        this.species=species;
        this.age=age;
        this.weight=weight;
        this.color=color;
        this.habitat=habitat;
        this.isDomestic=isDomestic;
        this.diet=diet;
    }

    public void getDetails(){
        System.out.println("Animal Name: "+ name);
        System.out.println("Animal Species: "+species);
        System.out.println("Animal age: "+age);
        System.out.println("Animal Weight: "+ weight);
        System.out.println("Animal color"+ color);
        System.out.println("Animal Habitat: "+habitat);
        System.out.println("Check Domestic: "+ (isDomestic ? "Yes":"No"));
        System.out.println("Animal Diet: "+ diet);
    }


    
}
