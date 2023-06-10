package classes;

public class Owner {
    public String name1,name2,name3,name4;
    public int y1,y2,y3,y4;
    public int s1,s2,s3,s4;
    protected static String id1="20-41994-1";
    protected static String id2="20-42004-1";
    protected static String id3="20-42005-1";
    protected static String id4="20-42009-1";
    
    

    public Owner(String name1, String name2, String name3, String name4, int y1, int y2,int y3,int y4, int s1, int s2,int s3,int s4, String id1, String id2,String id3,String id4) {

        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
    }
    
	public void ownerinfo(){
            System.out.println("\n---------------- Owner Info ----------------");
            System.out.println("--------------------------------------------");
            System.out.println("Owner name              : "+name1);
            System.out.println("Age                     : "+y1);
            System.out.println("Share Capital           : "+s1+"%");
            System.out.println("ID                      : "+id1);
            System.out.println("--------------------------------------------");
            System.out.println("Owner name              : "+name2);
            System.out.println("Age                     : "+y2);
            System.out.println("Share Capital           : "+s2+"%");
            System.out.println("ID                      : "+id2);
            System.out.println("--------------------------------------------");
            System.out.println("Owner name              : "+name3);
            System.out.println("Age                     : "+y3);
            System.out.println("Share Capital           : "+s3+"%");
            System.out.println("ID                      : "+id3);
            System.out.println("--------------------------------------------");
            System.out.println("Owner name              : "+name4);
            System.out.println("Age                     : "+y4);
            System.out.println("Share Capital           : "+s4+"%");
            System.out.println("ID                      : "+id4);
            System.out.println("--------------------------------------------");
    }


    
}
