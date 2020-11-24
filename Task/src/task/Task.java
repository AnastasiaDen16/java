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
    static Products product;
    static Products [] prod;
    static int countProd;
    static String [] prodList;
    static String [] card;
    static int keyCard = 0;
    static Cards cards;
            
    public static void main(String[] args) {
        prod = new Products[countProd];
        ChoiseMain();
        /*
        * нормальный вывод чека
        * подсчет суммы и скидки
        * в ChoiseCard() отправлять выбранную карту/скидку
        * */

    }

    static void ChoiseMain(){
        System.out.println("Добро пожаловать в наш магазин!\n " +
                "1 - Выбрать карту\n " +
                "2 - Выбрать продукты\n " +
                "3 - Вывести чек\n " +
                "0 - Выход");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер:");
        int key = scan.nextInt();
        switch (key){
            case 0: System. exit(0);
            break;
            case 1:ChoiseCard();
                break;
            case  2: ChoiseProducts();
                break;
            case 3: PrintCheck(prod);
                break;
            default:{System.out.println("Выбран неверный номер"); ChoiseMain();}
        }
    }
    static void ChoiseCard(){
        cards = new Cards();
        System.out.println("Выберите карту:");
        cards.GetCards();
        System.out.println("0 - Нет карты");
        System.out.print("Введите номер:");
        Scanner scan = new Scanner(System.in);
        keyCard = scan.nextInt();
        ChoiseMain();
    }
    static void ChoiseProducts(){
        product = new Products();
        prodList=product.GetProducts();
        for (String p : prodList){
        System.out.println(p);
        }
        System.out.print("Введите номер:");
        Scanner scan = new Scanner(System.in);
        int keyProd = scan.nextInt();
        System.out.print("Введите количество продукции:");
        int count = scan.nextInt();
        prod[countProd] = new Products(countProd,prodList[0],count,Double.parseDouble(prodList[1]),cards.GetSale(keyCard-1));
        countProd++;
        ChoiseMain();
    }

    static  void PrintCheck(Products [] prod){
        for(Products p: prod){
        p.printProduct(countProd);}
        ChoiseMain();
                
        
    }


}
