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
public class Task {

    public static void main(String[] args) {
        Products prod = new Products(1,"Cucumber",5.2,56);
        prod.displayPrint();
    }
}
class Products {
    int itemId;
    String name;
    double price;
    int quantity;
    int sale;

    Products(int itemId, String name, double price, int quantity){
        this.itemId = itemId;
        this.name = name;
        this.price= price;
        this.quantity = quantity;
    }
    
    void displayPrint (){
    System.out.printf("QTY %q \tName: %s \tPrice: %.2f \tTotal: %d \tSale: %d\n",quantity,name, price,itemId,sale);
}
}
