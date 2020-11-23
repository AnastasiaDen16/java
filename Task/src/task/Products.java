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
    int id;
    String description;
    double price;
    int quantity;
    int sale;
    double card;

    Products(int id, String description, int quantity, double price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    Products(int id, String description, int quantity, double price, double card) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.card = card;
    }
    double getTotal() {
        return this.quantity * this.price;
    }

    double getTotalWithCard() {
        double saleProc = card / 100;
        double sale = getTotal() * saleProc;
        return getTotal() - sale;
    }

    void printProduct() {
        System.out.printf("Quantity: %d \tDescription: %s \tPrice: $%.2f \tTotal: $%.2f \n", quantity, description, price, this.card == 0 ? getTotal() : getTotalWithCard());
    }
    void displayPrint (){
    System.out.printf("QTY %o \tName: %s \tPrice: %.2f \tTotal: %d \tSale: %d\n",quantity,description, price,id,sale);
}
}
