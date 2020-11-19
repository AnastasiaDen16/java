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
import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {
        ArrayList<String> cards = Cards();
        System.out.println("Выберите карту:");
        for (int i=0; i< cards.size();i++){
           System.out.printf("%i Card - %c",i,cards.get(i));
        }
        Products prod = new Products(1,"Cucumber",5.2,56);
        prod.displayPrint();
    }
    
    public static ArrayList<String> Cards (){    
        ArrayList<String> cards = new ArrayList<>();
        cards.add("card3");
        cards.add("card5");
        cards.add("card10");
        cards.add("card15");
        return cards;
    }
}
