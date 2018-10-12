public class Car extends Vehicle {

    @Override
    public void speedUp() {
        System.out.println("Me llamo " + this.name + " y soy un coche que está acelerando");
    }

    @Override
    public void brake() {
        System.out.println("Me llamo " + this.name + " y soy un coche que está frenando");
    }
}
