public class Motorcycle extends Vehicle {

    @Override
    public void speedUp() {
        System.out.println("Me llamo " + this.name + " y soy una moto que está acelerando");
    }

    @Override
    public void brake() {
        System.out.println("Me llamo " + this.name + " y soy una moto que está frenando");
    }

}
