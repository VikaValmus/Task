package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {

    private int price;

    public Appliance() {
    }

    public Appliance(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return price == appliance.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "" +
                "price=" + price +
                '}';
    }
}
