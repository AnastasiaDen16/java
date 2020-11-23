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
    public static void main(String[] args) {
        ChoiseMain();
        /*Добавить в Products получение из файла
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
            case 3: PrintCheck();
                break;
            default:{System.out.println("Выбран неверный номер"); ChoiseMain();}
        }
    }
    static void ChoiseCard(){
        Cards cards = new Cards();
        System.out.println("Выберите карту:");
        cards.GetCards();
        System.out.print("Введите номер:");
        Scanner scan = new Scanner(System.in);
        int keyCard = scan.nextInt();
        ChoiseMain();
    }
    static void ChoiseProducts(){
        ChoiseMain();
    }

    static  void PrintCheck(){
        product = new Products(1, "lemon", 5, 3.5);
        product.printProduct();
        ChoiseMain();
    }


}
