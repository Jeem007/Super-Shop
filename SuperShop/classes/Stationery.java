package classes;

import java.util.Scanner;

import interfaces.*;

public class Stationery implements Stationeryitems {
    @Override
    public void displayStationerysitems(){
        System.out.println("\n======= Welcome to Stationery section =====");
        System.out.println("");
        System.out.println("1. Pen............................20/-");
        System.out.println("2. Pencil.........................20/-");
        System.out.println("3. Eraser.........................25/-");
        System.out.println("4. Sharpener......................15/-");
        System.out.println("5. Offset Papers.................380/-");
        System.out.println("6. Staplers......................150/-");
        System.out.println("7. Papeer Clips...................40/-");
        System.out.println("8. Markers........................50/-");
        System.out.println("9. Scientific Calculator........1600/-");

    }
    @Override
    public int displayStationeryitemsbill(){
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
                    totalBill += 20;
                    System.out.println("Bill from this section 20/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '2') {
                    totalBill += 20;
                    System.out.println("Bill from this section 20/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '3') {
                    totalBill += 25;
                    System.out.println("Bill from this section 25/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '4') {
                    totalBill += 15;
                    System.out.println("Bill from this section 15/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '5') {
                    totalBill += 380;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '6') {
                    totalBill += 150;
                    System.out.println("Bill from this section 150/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '7') {
                    totalBill += 40;
                    System.out.println("Bill from this section 40/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '8') {
                    totalBill += 50;
                    System.out.println("Bill from this section 50/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                else if(c == '9') {
                    totalBill += 1600;
                    System.out.println("Bill from this section 1600/-");
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                
                System.out.println("Total Buy = "+totalBill+" Tk");
    }
    return totalBill;
    
}
}
