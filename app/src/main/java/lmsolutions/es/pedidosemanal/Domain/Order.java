package lmsolutions.es.pedidosemanal.Domain;

import java.util.List;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public class Order {
    private int id;
    private String nameOfSalesPerson, date;
    private List<Article> listArticles;
    private double total;

    public Order() {
    }

    public Order(int id, double total, String nameOfSalesPerson, String date, List<Article> listArticles) {
        this.id = id;
        this.total = total;
        this.nameOfSalesPerson = nameOfSalesPerson;
        this.date = date;
        this.listArticles = listArticles;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nameOfSalesPerson='" + nameOfSalesPerson + '\'' +
                ", date='" + date + '\'' +
                ", listArticles=" + listArticles +
                ", total=" + total +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSalesPerson() {
        return nameOfSalesPerson;
    }

    public void setNameOfSalesPerson(String nameOfSalesPerson) {
        this.nameOfSalesPerson = nameOfSalesPerson;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Article> getListArticles() {
        return listArticles;
    }

    public void setListArticles(List<Article> listArticles) {
        this.listArticles = listArticles;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
