/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Анастасия
 */
public class Products {
    int [] id;
    String [] description;
    double [] price;
    int [] quantity;
    int card;
    String [] productList;

    Products(){
        id = new int[1];
        description = new String[1];
        quantity = new int[1];
        price= new double[1];
    }
    Products(int id, String description, int quantity, double price) {
        this.id [0]= id;
        this.description [0]= description;
        this.quantity [0]= quantity;
        this.price [0]= price;
    }

    Products(int id, String description, int quantity, double price, int card) {
        this.id [0] = id;
        this.description[0] = description;
        this.quantity [0]= quantity;
        this.price [0]= price;
        this.card = card;
    }
   
    public String [] GetProducts(){
        try(FileReader fr= new FileReader("Product.txt"))
        {
            Scanner scan = new Scanner(fr);
            int i = 0;
            ArrayList<String> text = new ArrayList<>();
            while (scan.hasNextLine()) {
                text.add(scan.nextLine());
                i++;
            }
            productList = new String[text.size()];
            String delimeter = "-";
            for (int j=0; j<text.size();j++){
                productList = text.get(j).split(delimeter);
                System.out.println((j+1) + " " + productList[0] + " price = " + productList[1]);
            }
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return productList;
    }
    
    double getTotal(int i) {
        return this.quantity[i] * this.price[i];
    }

    double getTotalWithCard(int i) {
        double saleProc = card / 100;
        double sale = getTotal(i) * saleProc;
        return getTotal(i) - sale;
    }

    void printProduct(int countProd) {
        for(int i=0; i<countProd;i++){
        System.out.printf("Quantity: %d \tDescription: %s \tPrice: $%.2f \tTotal: $%.2f \n", quantity[i], description[i], price[i], this.card == 0 ? getTotal(i) : getTotalWithCard(i));
        }
    }
}
