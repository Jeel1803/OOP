/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalManagement;

import StockMaintainance.*;
import java.util.Date;

/**
 *
 * @author jeelk
 */
public class Rental {
    private int customerID;
    private Date from;
    private Date to;
    private Guitar guitar;
    private Date returnDate;

    public Rental(int customerID, Date from, Date to, Guitar guitar, Date returnDate) {
        this.customerID = customerID;
        this.from = from;
        this.to = to;
        this.guitar = guitar;
        this.returnDate = returnDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Guitar getGuitar() {
        return guitar;
    }

    public void setGuitar(Guitar guitar) {
        this.guitar = guitar;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
}
