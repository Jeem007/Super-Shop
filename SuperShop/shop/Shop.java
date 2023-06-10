package shop;
import java.util.*;
import classes.*;
import fileio.Fileio;

public class shop {
        public static void main(String[] args) {

            Fileio io= new Fileio();
            io.writeInFile("\nHello, This is our Super Shop.Here we sell fresh and genuine products. ");
            io.readFromFile();
            System.out.println();
            double value;

            int i,p=0,q=0,r=0,s=0;
            System.out.println();
            System.out.println("\t========== Welcome to Super Shop ==========\n");
            System.out.println("Please Select your Desired Option: ");
            System.out.println(" ");
            System.out.println("1. Shop details: ");
            System.out.println("2. Owner Details: ");
            System.out.println("3. Items: ");
            System.out.println("4. Calculation: ");
            System.out.println("5. Admin Panel: ");
            System.out.println("6. Exit: ");
            while(true){
            System.out.println();
            System.out.print("Which option do you want to choose: ");
            Scanner input=new Scanner(System.in); //Scanner
            while(true) {
              try {
                i=input.nextInt();
                input.nextLine();
                break;
              }catch(Exception e) {
                input.nextLine();
                System.out.print("\n\t !!Wrong Input!!  Provide a Integer Value: ");
              }
            }
                switch(i){
                case 1:{
                    System.out.println();
                    Shopdetails sp=new Shopdetails("Super Shop",4,"Kafrul/Dhaka","10 AM -9 PM","Sunday",1,4);
                    sp.display();
                    break;
                }


                case 2:{
                    Owner o1=new Owner("Md Tanvir Rahman Tushar", "Md Mehedi Hasan Tanveer", "Rakib Hasan Jeem", "Md Tanzidul Haque", 21, 21, 21, 21, 25, 25, 25, 25, "20-41994-1", "20-42004-1", "20-42005-1", "20-42009-1");
                    o1.ownerinfo();
                    break;
                }

                case 3:{
                int a;
                items  ilist=new items();
                
                ilist.info();
                  while(true){
                    System.out.println("Enter your choice:");
                    System.out.println("Enter 0 to exit:");
                    while(true) {
                      try {
                          a=input.nextInt();
                          input.nextLine();
                          break;
                        }catch(Exception e) {
                        input.nextLine();
                        System.out.print("\n\t !!Wrong Input!!  Provide a Integer Value: ");
                      }
                    }
                     if(a==0){
                         break;
                     }
                     if(a==1){
                            Groceries g1 = new Groceries();
                            g1.displayGroceries();
                            p=g1.displayGrocerieBill();
                        }
                     if(a == 2){
                             Vegetables veg=new Vegetables();
                             veg.display_Vegitems();
                             q=veg.Veg_itemsbill();
                            }
                     if(a == 3){
                            Non_Veg nvg = new Non_Veg();
                            nvg.display_Non_Veg_items();
                            r = nvg.display_Non_Veg_items_sbill();
                     }
                     if(a == 4){
                            Stationery sta=new Stationery();
                            sta.displayStationerysitems();
                            s= sta.displayStationeryitemsbill();

                            }
                    }
                     break;
                   }
                            
                    case 4:{
                        value=p+q+r+s;
                            final String code = "abcd12";
                            System.out.println("\nDo You have a voucher code for Discount? : ");
                            while(true)
                             {
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                System.out.println("Yes or No");
                                while(true) {
                                  try {
                                        i = input.nextInt();
                                      input.nextLine();
                                      break;
                                    }  
                                    catch(Exception e) {
                                        input.nextLine();
                                        System.out.print("\n\t !!Wrong Input!!  Provide a Integer Value: ");
                                    }
                                }
                                switch(i){
                                case 1:
                                {
                                input = new Scanner(System.in);

                                System.out.println("Enter voucher code to get 20% off:");
                                String inputpin = input.nextLine();

                                if (inputpin.equalsIgnoreCase(code)) 
                                  {
                                    double finalbill = value;
                                    finalbill=finalbill-(finalbill*.2);
                                       
                                       System.out.println("Total Bill: "+value);
                                       System.out.println("Your bill after 20% off: " +finalbill);
                                       System.out.println("Your discount is processed.");
                                       
                                    }
                                    else
                                    {
                                      System.out.println("Sorry,No Discount code available for you");
                                      System.out.println("Total Bill: "+value);
                                    }

                              break;


                          }
                            case 2:{
                                System.out.println("Total Bill :"+value);
                                break;
                                 }
                            default:
                                System.out.println("!!!! Invalid Input !!!!");
                                }
                                break;
                             }
                          break;
                        }

                       case 5:{
                        System.out.println();
                        Login lg=new Login("Md Tanvir Rahman Tushar", "Md Mehedi Hasan Tanveer", "Rakib Hasan Jeem", "Md Tanzidul Haque", 21, 21, 21, 21, 25, 25, 25, 25, "20-41994-1", "20-42004-1", "20-42005-1", "20-42009-1");
                        lg.loginsystem();
                                
                        } 
                       case 6:{
                            System.out.println("Good Bye,Come back to our shop once again.Have a Nice Day");
                            System.exit(0);
                            break;
                        }
                       default:
                            System.out.println("!!!! Invalid Option chosen !!!!");
                        }
                }
    
        }

}

