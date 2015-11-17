package lmsolutions.es.pedidosemanal.Domain;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public class Article {
    private String name;
    private int id, unitsPerWeek,unitsNow;
    private double price;

    public Article(){

    }

    public Article(int id, String name, int unitsPerWeek, int unitsNow, double price) {
        this.id = id;
        this.name = name;
        this.unitsPerWeek = unitsPerWeek;
        this.unitsNow = unitsNow;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnitsNow() {
        return unitsNow;
    }

    public void setUnitsNow(int unitsNow) {
        this.unitsNow = unitsNow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitsPerWeek() {
        return unitsPerWeek;
    }

    public void setUnitsPerWeek(int unitsPerWeek) {
        this.unitsPerWeek = unitsPerWeek;
    }

    @Override
    public String toString() {
        return "Article{" +
                ", id=" + id +
                "name='" + name  +
                ", unitsPerWeek=" + unitsPerWeek +
                ", unitsNow=" + unitsNow +
                ", price=" + price +
                '}';
    }
}
