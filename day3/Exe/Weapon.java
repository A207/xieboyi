public class Weapon implements Assaultable,Mobile {
	public void attack(){}
	public void move(){}

}

class Tank extends Weapon
{
	public void attack()
	{
		System.out.println("坦克攻击");
	}
	public void move()
	{
		System.out.println("坦克移动");
	}
}

class Flighter extends Weapon
{
	public void attack()
	{
		System.out.println("战机攻击");
	}
	public void move()
	{
		System.out.println("战机移动");
	}
}

class Warship extends Weapon
{
	public void attack()
	{
		System.out.println("战船攻击");
	}
	public void move()
	{
		System.out.println("战船移动");
	}
}


