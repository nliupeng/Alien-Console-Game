// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public class AlienTest 
{ 
  public static void main(String[] args) 
  { 
    Alien brutus = new SnakeAlien(100,"brutus");       // Creating alien objects
    Alien slimy = new OgreAlien(100,"slimy"); 
    Alien puffy = new MarshmallowAlien(100,"puffy"); 
 
    AlienPack pack = new AlienPack(3);                 // Creating an alien pack (array)
    pack.addAlien(brutus, 0); 
    pack.addAlien(slimy, 1); 
    pack.addAlien(puffy, 2); 
 
    System.out.println("Total pack damage = " +        // Display total pack damage 
    pack.calculateDamage()); 
  } 
} 

