package ToyBuilder;

public class Main {
    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();
        System.out.println(toyCar.color);
        toyCar.setColor("red");
        System.out.println(toyCar.getColor());
        toyCar.move();
    }
}
