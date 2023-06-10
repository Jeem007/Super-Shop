package classes;

import java.util.Scanner;

public class Login extends Owner  {
    int choice;
    
    public Login(String name1, String name2, String name3, String name4, int y1, int y2,int y3,int y4, int s1, int s2,int s3,int s4, String id1, String id2,String id3,String id4) {
    super(name1, name2, name3 ,name4, y1, y2, y3, y4, s1, s2, s3, s4, id1, id2, id3, id4);
   
  }

  public void loginsystem() {
    Scanner input=new Scanner(System.in); // Scanner
    
     
    System.out.println("Enter your userid:");
    String id=input.nextLine();
    System.out.println("Enter your password:");
    String password=input.nextLine();
        if((id.equals(id1)||id.equals(id2)||id.equals(id3)||id.equals(id4)) &&  "s1234".equals(password) ){
           System.out.println(">>>>> You have successfully logged into your account <<<<<");
            while(true){
                System.out.println("\n-----------------------------------");    
                System.out.println("\n1. Employee Details.");
                System.out.println("2. Manager Details.");
                System.out.println("3. Shop Income Statement"); 
                System.out.println("\n-----------------------------------");
                System.out.print("Which option do you want to choose? ");
                choice = input.nextInt();
                switch(choice){
                    case 1:{
                     System.out.println();
                     Employees e1=new Employees("Bodrul Islam","101-a",10000, "Karim Islam", "Rehana Begum", "06/09/2000","18 July 2017", "Noakhali", "Dhaka", "akash@gmail.com", "121323", "Married");
                     e1.Employeeinfo();
                     System.out.println("\n\n");

                     Employees e2=new Employees("A.F.M.Abdur Rahman","102-a",11000,"Kamal Rahman","Sadia Sultana", "07/11/2001","22 October 2017", "Barishal", "Dhaka", "parvez@gmail.com", "123458", "Unmarried");
                     e2.Employeeinfo();
                     System.out.println("\n\n");

                     Employees e3=new Employees("Abduz Rahim","103-a", 12000,"Abduz Sazzad","Anika Tabassum","07/12/2001","25 November 2019","Pabna","Dhaka", "rahim@hotmail.com", "345674",  "Married");
                     e3.Employeeinfo();
                     System.out.println("\n\n");

                     Employees e4=new Employees("Mostafizur Rahman","104-a",13000,"Ziaur Rahman Tushar","Nusrat Sayma","09/12/2002", "22 December 2016","Sylhet","Dhaka", "mostafizur@gmail.com", "122454", "Married");
                     e4.Employeeinfo();
                     System.out.println("\n\n");
                     
                     break;
                    }
                    case 2:{
                        System.out.println();
                        Manager m1=new Manager("Ziaul Haque Polash",30,"10122-a","03/04/1990","anis@gmail.com","01722**","MD. Rehanul Haque","Afsana Kabir","Barisal","Dhaka","Married",18000); 
                        m1.managerinfo();
                        break;
                    }
                    case 3:{
                        System.out.println("More information about the shop: ");
                        ShopInfo si=new ShopInfo(12000,19000,50000,27000,100000,5000,1000);
                        si.ShopStatemnet();
                        break;
                    }
                    
                    default:
                        System.out.println("Invalid iption chosen");
                        
                }
                
                break;
            }
   
        }
        else
        System.out.println("!!!!! Invalid user id or Password !!!!!");
        
    }
}

