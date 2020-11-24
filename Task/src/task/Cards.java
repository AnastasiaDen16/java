package task;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cards {
    String [] nameCard;
    int[] sale;

    public int GetSale(int i){ return this.sale[i]; }

    public void GetCards(){
        try(FileReader fr= new FileReader("Cards.txt"))
        {
            Scanner scan = new Scanner(fr);
            int i = 0;
            String [] card;
            ArrayList<String> text = new ArrayList<>();
            while (scan.hasNextLine()) {
                text.add(scan.nextLine());
                i++;
            }
            nameCard = new String[text.size()];
            sale = new int[text.size()];
            String delimeter = "-";
            for (int j=0; j<text.size();j++){
                card = text.get(j).split(delimeter);
                this.nameCard[j] = card[0];
                this.sale[j] = Integer.parseInt(card[1]);
                System.out.println((j+1) +" " + card[0] + " sale = " + card[1]);
            }
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
