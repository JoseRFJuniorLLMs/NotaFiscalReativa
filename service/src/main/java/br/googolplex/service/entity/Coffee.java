package br.googolplex.service.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 * Santiago Chile 07/07/2020
 */
@Document
public class Coffee {

    private String id;
    private String coffeeType;
    private int price;

    public Coffee() {
    }

    public Coffee(String coffeeType, int price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
