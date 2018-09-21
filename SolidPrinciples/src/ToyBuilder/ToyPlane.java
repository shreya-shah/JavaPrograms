package ToyBuilder;

import java.math.BigDecimal;

public class ToyPlane implements Toy,Movable,Flyable {
    String color;
    BigDecimal price;

    @Override
     public void move(){
        System.out.println("Moving Toy Plane");
    }

    @Override
    public void fly() {
        System.out.println("Flying Toy Plane");
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
