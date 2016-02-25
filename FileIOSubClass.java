// Nelly Liu Peng
// CS141-1 - Lab5 Part I
// 5-19-14

import java.io.*;
import java.util.Scanner;

public class FileIOSubClass extends FileIO
{
  // METHOD THAT OPENS A FILE, READS IT, AND DISPLAYS ITS CONTENT
  void fileRead(String s) throws IOException 
  { 
    File myFile = new File(s);                     // Create a File object
    if(!myFile.exists())                           // Check if input file exists
    {
      System.out.println("Input file not found");  // Exit program if file not found
      System.exit(0);
    }
    Scanner inputFile = new Scanner(myFile);       // Create a Scanner object to display File object
    String line;                                   // To hold a String value
    while(inputFile.hasNext())                     // Perform task until end of file
    {
      line = inputFile.nextLine();                 // Display lines on screen
      System.out.println(line);
    }
    inputFile.close();                             // Close the file
  }

  // METHOD THAT ACCEPTS A FILE OBJECT, READS IT, AND DISPLAYS ITS CONTENT
  void fileRead(File object) throws IOException
  {
    if(!object.exists())                           // Check if input file exists
    {
      System.out.println("Input file not found");  // Exit program if file not found
      System.exit(0);
    }
    Scanner inputFile = new Scanner(object);       // Create a Scanner object to display File object
    String line;                                   // To hold a String value
    while(inputFile.hasNext())                     // Perform task until end of file
    {
      line = inputFile.nextLine();                 // Display lines on screen
      System.out.println(line);
    }
    inputFile.close();                             // Close the file
  } 

  // METHOD THAT OPENS A FILE AND WRITES AN ARRAY TO IT   
  void fileWrite(String s, String[] a) throws IOException 
  { 
    File f = new File(s);                          // Create a File object
    if(!f.exists())                                // Check if input file exists
    {
      System.out.println("Input file not found");  // Exit program if file not found
      System.exit(0);
    }
    FileWriter fw = new FileWriter(f, true);       // Create a FileWriter object
    PrintWriter myFile = new PrintWriter(fw);      // Create a PrintWriter object
    for(int i=0; i<a.length; i++)                  // Loop through array and append to file
      myFile.println(a[i]);
    System.out.println("File appended");           // Announce that file has been appended
    myFile.close();                                // Close the file
  } 
}
