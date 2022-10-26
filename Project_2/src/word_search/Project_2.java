package word_search;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;


public class Project_2 {
	public static void main(String args[]) throws IOException {
		File fL = new File("data.txt"); //Creation of File Descriptor for input file
	    FileReader fr = new FileReader(fL);  
	Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter the word you wish to search for");
    String word = sc1.next();
    boolean flag = false;
    int count = 0;
    System.out.println("Contents of the file");
    //Reading the contents of the file
    Scanner sc2 = new Scanner(new FileInputStream("data.txt")); //scanner for the .txt file
    while(sc2.hasNextLine()) {
       String line = sc2.nextLine();
       System.out.println(line);
       if(line.indexOf(word)!=-1) {
          flag = true;
          count = count+1;
       }
    }
    if(flag) {
       System.out.println("File contains the specified word");
       System.out.println("It apperas: "+ count + " time.");
    } else {
       System.out.println("File does not contain the specified word");
    }
 }
}



    
/*String search = sc1.next();
    
    int count = 0;
    String w; 
    while((w=br.readLine())!=null)   //Reading Content from the file
    {
       words=w.split(" ");  //Split the word using space
        for (String word : words) 
        {
               if (word.equals(sc1))   //Search for the given word
               {
                 count++;    //If Present increase the count by one
               }
        }
    }
    if(count!=0)  //Check for count not equal to zero
    {
       System.out.println("The given word is present for "+ count + " times in the file");
    }
    else
    {
       System.out.println("The given word is not present in the file");
    }
    
       fr.close();
 }
}
    */