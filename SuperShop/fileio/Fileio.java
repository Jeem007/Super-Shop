package fileio;

import java.io.*;
import interfaces.*;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Fileio implements Io {
   
	public File file;				
	public FileWriter fwr;		
	public FileReader frd;			
		
	
	
        @Override
	public void writeInFile(String s){
		try
		{
			file = new File("C:/Users/rakib/Desktop/SuperShop/fileio/Shopdetails.txt");	
			file.createNewFile();					
            fwr= new FileWriter(file, false);
			fwr.write(s);											
			fwr.flush();
			fwr.close();							
		}
		catch(IOException e1)
		{
			e1.getMessage();
		}
	}
	
        @Override
	public void readFromFile(){
		
		try{
			frd = new FileReader(file); 
			Scanner reader = new Scanner(frd);
			while(reader.hasNextLine()){
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();                           
		}
		catch(FileNotFoundException e1){
			e1.getMessage();
		}
	}

	}
     
        
            
               
            
        
    
   

  
       

    
  
    






