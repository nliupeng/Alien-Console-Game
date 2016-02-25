// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public class SnakeAlien extends Alien
{
  // INSTANCE VARIABLE
  private final int SNAKE_DAMAGE = 10;       
  
  // 2-ARG COSNTRUCTOR
  public SnakeAlien(int health, String name)
  {
    super(health, name);
  }

  // TO GET DAMAGE INFLICTED BY ALIEN
  public int getDamage()
  {
    return SNAKE_DAMAGE;
  }
}
