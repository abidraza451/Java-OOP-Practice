public class MainDriver {

    public static void main(String[] args) {
        System.out.println("==============this is details of the Employee======================");
        Employee emp =new Employee(101, "John Doe", "IT", 75000);
        emp.displayDetails();

        System.out.println("=================this is details of the laptop===============");

        Laptop laptop =new Laptop("Acer", "Aspire 5", 35000, 16);
        laptop.showSpecs();

        System.out.println("===================this is details of the Browser==============");

        Browser browser =new Browser("Chrome", "117.99", true);
        browser.openBrowser();

        System.out.println("===================this is detials of the Fruit================= ");

        Fruit fruit=new Fruit("Mango", "Yellow", true);
        fruit.describeFruit();

    }
}
