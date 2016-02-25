// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public class MarshmallowAlien extends Alien
{
  // INSTANCE VARIABLE
  private final int MARSHMALLOW_DAMAGE = 1;

  // 2-ARG COSNTRUCTOR
  public MarshmallowAlien(int health, String name)
  {
    super(health, name);
  }

  // TO GET DAMAGE INFLICTED BY ALIEN
  public int getDamage()
  {
    return MARSHMALLOW_DAMAGE;
  }
}


