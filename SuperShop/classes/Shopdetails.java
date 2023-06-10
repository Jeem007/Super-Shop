
package classes;
public class Shopdetails {
    public String shopname;
    public int numberofowners;
    public String address;
    public String time;
    public String offDay;
    public int numberofmanagers;
    public int numberofemployees;

    public Shopdetails(String shopname, int numberofowners, String address, String time,String offDay, int numberofmanagers, int numberofemployees) {
        this.shopname = shopname;
        this.numberofowners = numberofowners;
        this.address = address;
        this.time = time;
        this.offDay = offDay;
        this.numberofmanagers = numberofmanagers;
        this.numberofemployees = numberofemployees;
    }
    public void display(){
        System.out.println("\n------------------------ Shop Details ------------------------");
        System.out.println("Shop name                                 : "+shopname);
        System.out.println("Number of owners                          : "+numberofowners);
        System.out.println("Address                                   : "+address);
        System.out.println("Shop Opening and Closing Time             : "+time);
        System.out.println("Off Day:                                  : "+offDay);
        System.out.println("Number of managers                        : "+numberofmanagers);
        System.out.println("Number of employees                       : "+numberofemployees);
        System.out.println("---------------------------------------------------------------");
    }
    
    


    
}
