class Car extends Vehicle {
    String color;

    public Car(String make, String model, String color) {
        super(make, model);
        this.color = color;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("The car is ready to go!");
    }

    public void honkHorn() {
        System.out.println("The " + color + " car is honking its horn.");
    }
}