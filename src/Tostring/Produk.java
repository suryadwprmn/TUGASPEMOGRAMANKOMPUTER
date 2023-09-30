package Tostring;

import java.util.Objects;

public class Produk {
    String name;
    Integer price;

    public Produk(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produk name" + name + ", price :" + price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produk produk = (Produk) o;

        if (!Objects.equals(name, produk.name)) return false;
        return Objects.equals(price, produk.price);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
    }

