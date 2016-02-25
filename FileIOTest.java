// Nelly Liu Peng
// CS141-1 - Lab5 Part I
// 5-19-14

// HARD-CODED CASES TO TEST FUNCTIONALITY OF PROGRAM

import java.io.*;
import java.util.Scanner;

public class FileIOTest
{
  public static void main(String[] args) throws IOException
  {
    /* TEST 1 */
    FileIO file1 = new FileIOSubClass(); // Create a FileIO object
    String input1 = "dat1.txt";                  // File "dat1.txt" exists
    file1.fileRead(input1);                      // Display contents of input file
    System.out.println();

    /* TEST 2 */
    File aFileObject = new File("dat2.txt");     // Create a File object. "dat2.txt" exists
    file1.fileRead(aFileObject);                 // Display contents of file. A File object is passed as an argument
    System.out.println();

    /* TEST 3 */
    String[] array = {"October 10",              // Create an array with String contents
                      "November 11",
                      "December 12"};
    FileIO file2 = new FileIOSubClass();         // Create a FileIO object
    String input2 = "dat2.txt";                  // File "dat2.txt" exists
    file2.fileWrite(input2, array);              // Append the array contents into the file
    file2.fileRead(input2);                      // Display contents of input file
    System.out.println();

    /* TEST 4 */
    FileIO file3 = new FileIOSubClass();         // Create a FileIO object
    String input3 = "dat3.txt";                  // File "dat3.txt" does not exist
    file3.fileRead(input3);                      // Attempt to display input file, but error will occur
  }
}
