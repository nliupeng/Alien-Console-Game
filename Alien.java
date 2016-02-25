// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public abstract class Alien
{
  // FIELDS
  public int health;  
  public String name;
 
  // 2-ARG CONSTRUCTOR
  public Alien(int health, String name) 
  { 
    this.health = health; 
    this.name = name; 
  } 

  // SETTERS
  public void setHealth(int h)
  {
    health = h;
  }
  public void setName(String n)
  {
    name = n;
  }

  // GETTERS
  public int getHealth()
  {
    return health;
  }
  public String getName()
  {
    return name;
  }

  // TO GET DAMAGE INFLICTED BY ALIEN
  public abstract int getDamage();
}
