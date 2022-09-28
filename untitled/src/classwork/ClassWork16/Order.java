package classwork.ClassWork16;

import java.util.List;

public class Order {
    private int id;
    private List<Product> productList;

    public Order(int id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
