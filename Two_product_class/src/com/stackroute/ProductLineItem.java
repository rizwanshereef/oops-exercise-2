package com.stackroute;

public class ProductLineItem {

    /*private instance variable*/

    private int id;
    private int quantity;
    private Product product;

/*Parameterized constructor*/

    public ProductLineItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

/*Getter and setter for all variables*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

/*Method to print item details*/

    public String getItemDetails()
    {
        String getItemDetailsobj = "ProductLineItem{id="+id+", quantity='"+quantity+"', product="+product.getProductDetails()+"}";
        return getItemDetailsobj;
    }
}
