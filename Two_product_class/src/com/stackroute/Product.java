package com.stackroute;

public class Product {
/*private instance variable*/
    private int id;
    private String name;
    private String description;

    /*Parameterized constructor*/
    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
/*Getter and setter for all variables*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

/*Method to print product details*/

    public String getProductDetails()
    {
        String getproductobj="Product{name='"+name+"', description='"+description+"'}";
        return getproductobj;
    }
}
