package org.iesfm.discoShop;

import java.util.Date;
import java.util.Objects;

public class Order {
    private int price;
    private Date date;

    public Order(int price, Date date) {
        this.price = price;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return price == order.price && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date);
    }
}
