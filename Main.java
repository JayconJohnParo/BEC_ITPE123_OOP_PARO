public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota AE86", "Ferrari", "Bugatti");

        myCar.startEngine(); 
        myCar.honkHorn();   
        myCar.stopEngine();  

        
        System.out.println("My car is a " + myCar.make + " " + myCar.model + " in " + myCar.color + ".");
    }
}