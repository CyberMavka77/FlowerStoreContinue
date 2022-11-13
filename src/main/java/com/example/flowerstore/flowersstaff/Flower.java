package com.example.flowerstore.flowersstaff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter @Setter @AllArgsConstructor @Entity @Table @NoArgsConstructor
public class Flower extends Item {
    @Id
    @GeneratedValue
    private int id;
    private String color;
    private double price;
    private double sepalLength;

    public void setColor(FlowerColor coloR) {
        this.color = coloR.toString();

    }


}
