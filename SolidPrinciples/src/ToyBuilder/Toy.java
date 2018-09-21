package ToyBuilder;

import java.math.BigDecimal;

public interface Toy {

    void setPrice(BigDecimal price);
    void setColor(String color);
    String getColor();
    BigDecimal getPrice();
}
