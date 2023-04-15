package models;

public class Product {
    private Integer pid;
    private String title;
    private Integer price;

    public Product() {
    }

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
