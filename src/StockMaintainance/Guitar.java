/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockMaintainance;

import java.util.Date;
import java.time.Year;

/**
 *
 * @author jeelk
 */
public class Guitar {
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int serialNumber;
    private int year;
    private double rentCost;
    private String color;
    private double length;
    private double height;
    private double width;
    private Status status;
    private Date rentedDate;
    private Date dueDate;

    public Guitar(String model, Builder builder, Type type, Wood backWood, Wood topWood, int serialNumber, int year, double rentCost, String color, double length, double height, double width, Status status)//Date rentedDate, Date dueDate) {
    {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.serialNumber = serialNumber;
        this.year = year;
        this.rentCost = rentCost;
        this.color = color;
        this.length = length;
        this.height = height;
        this.width = width;
        this.status = status;
       /* this.rentedDate = rentedDate;
        this.dueDate = dueDate;*/
    }

    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(Date rentedDate) {
        this.rentedDate = rentedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    

    
    
  
    
    
}
