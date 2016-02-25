import java.io.*;

// Nelly Liu Peng
// CS141-1 - Lab5 Part I
// 5-19-14

// THIS BASE CLASS IS FAULTY. THE FILEIOSUBCLASS CLASS WILL PROVIDE METHODS TO
// OVERRIDE THOSE FROM THIS CLASS TO ACTUALLY MAKE THEM WORK 
public class FileIO 
{ 
  // This method opens up file s, reads and outputs to screen its contents 
  void fileRead(String s) throws IOException
  { 
    System.out.println("fileRead in the base class reached "); 
  } 
  
  // This method opens up file s, reads and outputs to screen its contents
  void fileRead(File object) throws IOException
  {
    System.out.println("fileRead in the base class reached ");
  }
 
  // This method opens up file s and writes array a to it 
  void fileWrite(String s, String[] a) throws IOException
  { 
    System.out.println("fileWrite in the base class reached "); 
  } 
} 
