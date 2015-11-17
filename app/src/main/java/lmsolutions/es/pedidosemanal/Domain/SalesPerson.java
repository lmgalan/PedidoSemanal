package lmsolutions.es.pedidosemanal.Domain;

import java.util.List;

/**
 * Created by LuisMiguel on 15/09/2015.
 */
public class SalesPerson {
    private int id;
    private String name,telephoneNumber;
    private List<Order> listOrder;
    private List<Article> listArticle;
    public SalesPerson() {

    }

    public SalesPerson(int id, String name, String telephoneNumber, List<Order> listOrder, List<Article> listArticle) {
        this.id = id;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.listOrder = listOrder;
        this.listArticle = listArticle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public List<Article> getListArticle() {
        return listArticle;
    }

    public void setListArticle(List<Article> listArticle) {
        this.listArticle = listArticle;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", listOrder=" + listOrder +
                ", listArticle=" + listArticle +
                '}';
    }
}
