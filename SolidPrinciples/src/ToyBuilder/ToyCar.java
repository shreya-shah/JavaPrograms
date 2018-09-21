package ToyBuilder;

import java.math.BigDecimal;

public class ToyCar implements Toy,Movable{
    String color;
    BigDecimal price;
    @Override
    public void move(){
        System.out.println("Moving Toy Car");
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
