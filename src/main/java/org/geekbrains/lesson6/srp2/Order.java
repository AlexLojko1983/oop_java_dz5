package org.geekbrains.lesson6.srp2;

public class Order {
    private InitOrder initOrder;

    private String clientName;
    private String product;
    private int qnt;
    private double price;

    /**
     * Два варианта создания Order
     * @param initOrder или clientName,product,qnt,price
     */
    public Order(InitOrder initOrder) {
        this.clientName = initOrder.getName();
        this.product = initOrder.getProduct();
        this.qnt = initOrder.getQnt();
        this.price = initOrder.getPrice();
    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order(){}

    protected String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", product='" + product + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
}
