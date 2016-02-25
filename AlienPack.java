// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public class AlienPack 
{
  // FIELD 
  private Alien[] aliens; 

  // CONSTRUCTOR
  public AlienPack(int numAliens) 
  { 
    aliens = new Alien[numAliens];                 // Create an array to hold number of aliens in pack
  } 
  
  // SETTER: ADDING ALIENS TO THE PACK
  public void addAlien(Alien newAlien, int index) 
  { 
    aliens[index] = newAlien;                      // Filling the array with aliens
  } 

  // GETTER
  public Alien[] getAliens() 
  { 
    return aliens; 
  } 

  // TO CALCULATE DAMAGE INFLICTED BY ALIEN PACK
  public int calculateDamage() 
  { 
    int damage = 0; 
    for (int i=0; i<aliens.length; i++)            // Call getDamage() from each alien to
      damage += aliens[i].getDamage();             // calculate total damage
    return damage; 
  } 
}
