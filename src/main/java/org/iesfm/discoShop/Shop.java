package org.iesfm.discoShop;

import java.util.Objects;
import java.util.Set;

public class Shop {

    private String nombre;
    private String direccion;
    private Set<Disc> discs;
    private Set<Member> members;

    public Shop(String nombre, String direccion, Set<Disc> discs, Set<Member> members) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.discs = discs;
        this.members = members;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Disc> getDiscs() {
        return discs;
    }

    public void setDiscs(Set<Disc> discs) {
        this.discs = discs;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(nombre, shop.nombre) && Objects.equals(direccion, shop.direccion) && Objects.equals(discs, shop.discs) && Objects.equals(members, shop.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, discs, members);
    }
}
