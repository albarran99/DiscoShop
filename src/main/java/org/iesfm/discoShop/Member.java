package org.iesfm.discoShop;

import java.util.List;
import java.util.Objects;


public class Member {
    private String name;
    private String surname;
    private String nif;
    private int cp;
    private List<Order> orders;

    public Member(String name, String surname, String nif, int cp, List<Order> orders) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.cp = cp;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return cp == member.cp && Objects.equals(name, member.name) && Objects.equals(surname, member.surname) && Objects.equals(nif, member.nif) && Objects.equals(orders, member.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nif, cp, orders);
    }
}
