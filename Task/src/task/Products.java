/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author Анастасия
 */
public class Products {
    int itemId;
    String description;
    double price;
    int quantity;
    int sale;

    Products(int itemId, String name, double price, int quantity){
        this.itemId = itemId;
        this.description = name;
        this.price= price;
        this.quantity = quantity;
    }
    
    void displayPrint (){
    System.out.printf("QTY %o \tName: %s \tPrice: %.2f \tTotal: %d \tSale: %d\n",quantity,description, price,itemId,sale);
}
}
