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
import java.io.*;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        System.out.println("Выберите карту:");
        GetCards();
        Products product = new Products(1, "lemon", 5, 3.5);
        product.printProduct();
       /* for (int i=0; i< Cards.size();i++){
           System.out.printf("%i Card - %c",i,cards.get(i));
        }*/
       // Products prod = new Products(1,"Cucumber",5.2,56);
        //prod.displayPrint();
    }

    static void GetCards(){
        try(FileReader fr= new FileReader("Cards.txt"))
        {
            Scanner scan = new Scanner(fr);    
            int i = 0;
            LineNumberReader lineNumberReader = new LineNumberReader(fr);
            int lineNumber = 0;
            while (lineNumberReader.readLine() != null){lineNumber++;}
            String [] text = new String[4];
            String [] Id = new String[4];
            while (scan.hasNextLine()) {
                //System.out.print(lineNumber);
                text[i] = scan.nextLine();
                System.out.println(i + " : " + text[i]);
                i++;
        }
        fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        Cards [] cards = new Cards[4];
        cards[0] = new Cards(1,3);
    }

}
