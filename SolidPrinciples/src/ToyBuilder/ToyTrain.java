package ToyBuilder;

import java.math.BigDecimal;

public class ToyTrain implements Toy,Movable {
    BigDecimal price;
    String color;

    @Override
    public void move(){
        System.out.println("Moving Toy Train");
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
