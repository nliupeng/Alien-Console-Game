// Nelly Liu Peng
// CS141-1 Lab 5 part II
// 5-19-14

public class OgreAlien extends Alien
{
  // INSTANCE VARIABLE
  private final int OGRE_DAMAGE = 6;

  // 2-ARG COSNTRUCTOR
  public OgreAlien(int health, String name)
  {
    super(health, name);
  }

  // TO GET DAMAGE INFLICTED BY ALIEN
  public int getDamage()
  {
    return OGRE_DAMAGE;
  }
}


