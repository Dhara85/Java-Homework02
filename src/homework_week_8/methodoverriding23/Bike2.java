package homework_week_8.methodoverriding23;
// Creating a child class
class Bike2 extends Vehicle{
    // defining the same method as in the parent class

    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }
}
