/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_application1;

import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Анастасия
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=10;
        int b =5;
        int c = a+b;
        System.out.println("c= "+c);
        int [] array= new int[5];
        //Scanner input = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
           //array[i]= input.nextInt();
           array[i] = (int) Math.round((Math.random() * 10));
        }
        System.out.println("Рандомный массив: ");
        Print(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        Print(array);
    }
    
    static public void Print(int [] a){
    for (int i=0; i<a.length;i++){System.out.print(a[i]+" ");}
    }
    
}
