public class Inheritance extends Car {

    public Inheritance(String name, String man) {
        super(name, man);
    }

    public void charge() {
        System.out.println("Charging ...");
    }

    public static void main(String[] args) {
        Inheritance modelS = new Inheritance("Model S", "Tesla");
        Inheritance modelS2 = new Inheritance("Model S", "Tesla");
    // prints Tesla
    System.out.println(modelS.getManufacturerName());
    // prints Charging ...
    modelS.charge();
    
    System.out.println(modelS.equals(modelS2));
    String s = "fine";
    String s2 = "fine";
    System.out.println(s.equals(s2));



}
}