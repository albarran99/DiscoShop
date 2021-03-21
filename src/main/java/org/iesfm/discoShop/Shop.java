package org.iesfm.discoShop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;


public class Shop {

    private String nombre;
    private String direccion;
    private TreeMap<Integer, Disc> disks;
    private HashSet<Member> members;

    public Shop(String nombre, String direccion, TreeMap<Integer, Disc> disks, HashSet<Member> members) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.disks = disks;
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

    public TreeMap<Integer, Disc> getDisks() {
        return disks;
    }

    public void setDisks(TreeMap<Integer, Disc> disks) {
        this.disks = disks;
    }

    public HashSet<Member> getMembers() {
        return members;
    }

    public void setMembers(HashSet<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(nombre, shop.nombre) && Objects.equals(direccion, shop.direccion) && Objects.equals(disks, shop.disks) && Objects.equals(members, shop.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, disks, members);
    }
}