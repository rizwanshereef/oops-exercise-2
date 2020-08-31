package com.stackroute;

public class Author {

    private String name;
    private String country;
/*Creating parameterized constructor*/
    public Author(String name, String country) {
        this.name = name;
        this.country = country;
    }
/* Creating getter and setter for all variables*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    /*Creating Default constructor*/
    public Author() {
    }
/* Method to return Author details as String*/
    public String getAuthorDetails()
    {
        String getAuthorDetailsOne = "Author{name='"+name+"', country='"+country+"'}";
        return getAuthorDetailsOne;
    }


}
