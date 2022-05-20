package com.shhdq;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Random rand = new Random();
       Scanner scan = new Scanner(System.in);

       int randomNumber = rand.nextInt(10) + 1;

       int count = 1;

       while(true) {
           System.out.println("Uzmini skaitli (1-10)");

           count++;

           int playerChoose = scan.nextInt();

           if(playerChoose == randomNumber) {
               System.out.println("Tu uzminēji pareizi ar " + count + " gājieniem!");
               break;
           } else if(randomNumber > playerChoose) {
               System.out.println("Cipars ir lielāks");
           } else {
               System.out.println("Cipars mazāks");
           }
       }




    }

}
