package com.stackroute;

import java.util.List;
import java.util.Scanner;

public class ProductOrder {


    private int id;
    private String name;
    private List<ProductLineItem> lineItems;
/*Creating constructor*/
    public ProductOrder(int id, String name, List<ProductLineItem> lineItems) {
        this.id = id;
        this.name = name;
        this.lineItems = lineItems;
    }

    /*Generating getter and setter*/
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

    public List<ProductLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<ProductLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /*Method to add line item to the order */
    public static void addItem()
    {
        System.out.println("Enter line item");
        Scanner scan =new Scanner(System.in);

    }

    /*Method to return list of productLineItem */

    public static List<ProductLineItem> getLineItem(){
        return null;
    }

    /*Method to line item from order */

    public static String removeItemById(){
        return null;
    }
}
