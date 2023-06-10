package classes;

import java.lang.*;
import java.util.Scanner;

import interfaces.*;

public class Vegetables implements Veg_Items {
    public void display_Vegitems(){
        System.out.println("\n===== Welcome to Vegetables Section =====");
        System.out.println("");
        System.out.println("1. Brinjal 1kg.......................65/-");
        System.out.println("2. Tomato 1kg........................30/-");
        System.out.println("3. Radish 1kg........................40/-");
        System.out.println("4. Beans 1kg.........................45/-");
        System.out.println("5. Cauliflower 1 kg..................70/-");
        System.out.println("6. Cabbage 1 kg.....................100/-");
        System.out.println("7. Potato 1kg........................20/-");
    }
    public int Veg_itemsbill(){
       Scanner sc1=new Scanner(System.in);
       System.out.println("Enter your choice = ");
            System.out.println("To confirm your order press '*'");
            char i = '0';
            
            int totalBill = 0;
            while(true) {
                
                i = sc1.next().charAt(0);
                
                if(i == '*') {
                    break;
                }
                
                else if(i == '1') {
                    totalBill += 65;
                    System.out.println("Bill from this section 65/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '2') {
                    totalBill += 30;
                    System.out.println("Bill from this section 30/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '3') {
                    totalBill += 40;
                    System.out.println("Bill from this section 40/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '4') {
                    totalBill += 45;
                    System.out.println("Bill from this section 45/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '5') {
                    totalBill += 70;
                    System.out.println("Bill from this section 70/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '6') {
                    totalBill += 100;
                    System.out.println("Bill from this section 100/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '7') {
                    totalBill += 20;
                    System.out.println("Bill from this section 20/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                
                System.out.println("Total Buy  = "+totalBill+ " Tk");
    }
    return totalBill;
    
}
}
