
package classes;

import java.util.Scanner;

import interfaces.*;

public class Non_Veg implements  Non_Vegetable_Items{
    @Override
    public void display_Non_Veg_items(){
        System.out.println("\n======= Welcome to Non-Veg section =====");
        System.out.println("");
        System.out.println("------------------- Meat -------------------");
        System.out.println("1. Chicken 1kg.........................500/-");
        System.out.println("2. Duck 1kg............................600/-");
        System.out.println("3. Beaf 1kg............................620/-");
        System.out.println("4. Mutton 1kg..........................850/-");
        System.out.println("------------------- Fish -------------------");
        System.out.println("5. Golda Prawn 1kg.....................850/-");
        System.out.println("6. Bata Fish 1kg.......................550/-");
        System.out.println("7. Rui Fish 1kg........................330/-");
        System.out.println("8. Deshi Puti Fish 1kg.................450/-");
        System.out.println("9. Rupchada Fish 1kg..................1100/-");
    }
    
    @Override
    public int display_Non_Veg_items_sbill(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice = ");
            System.out.println("To confirm your order press '*'");
            char c = '0';
            
            int totalBill = 0;
            while(true) {
                
                c = sc.next().charAt(0);
                
                if(c == '*') {
                    break;
                }
                
                else if(c == '1') {
                    totalBill += 500;
                    System.out.println("Bill from this section 500/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '2') {
                    totalBill += 600;
                    System.out.println("Bill from this section 600/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '3') {
                    totalBill += 620;
                    System.out.println("Bill from this section 620/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '4') {
                    totalBill += 850;
                    System.out.println("Bill from this section 850/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '5') {
                    totalBill += 850;
                    System.out.println("Bill from this section 850/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '6') {
                    totalBill += 550;
                    System.out.println("Bill from this section 550/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '7') {
                    totalBill += 330;
                    System.out.println("Bill from this section 330/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '8') {
                    totalBill += 450;
                    System.out.println("Bill from this section 450/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                else if(c == '9') {
                    totalBill += 1100;
                    System.out.println("Bill from this section 1100/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                
                System.out.println("Total Buy = "+totalBill+" Tk");
    }
    return totalBill;
    
        }
        
    }
    

