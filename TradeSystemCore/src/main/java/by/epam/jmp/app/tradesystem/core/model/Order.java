package by.epam.jmp.app.tradesystem.core.model;

import java.sql.Date;

public class Order extends IdentifiedType {

    private Date orderDate;
    private Product product;
    private User customer;
    private FormOfPayment formOfPayment;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    public void setFormOfPayment(FormOfPayment formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
        if (product != null ? !product.equals(order.product) : order.product != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        return formOfPayment != null ? formOfPayment.equals(order.formOfPayment) : order.formOfPayment == null;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", product=" + product +
                ", customer=" + customer +
                ", formOfPayment=" + formOfPayment +
                '}';
    }

    public static Order buildOrder(Date orderDate, Product product, User customer, FormOfPayment fop) {
        Order order = new Order();
        order.setOrderDate(orderDate);
        order.setProduct(product);
        order.setCustomer(customer);
        order.setFormOfPayment(fop);
        return order;
    }

}