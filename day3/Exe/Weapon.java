public class Weapon implements Assaultable,Mobile {
	public void attack(){}
	public void move(){}

}

class Tank extends Weapon
{
	public void attack()
	{
		System.out.println("̹�˹���");
	}
	public void move()
	{
		System.out.println("̹���ƶ�");
	}
}

class Flighter extends Weapon
{
	public void attack()
	{
		System.out.println("ս������");
	}
	public void move()
	{
		System.out.println("ս���ƶ�");
	}
}

class Warship extends Weapon
{
	public void attack()
	{
		System.out.println("ս������");
	}
	public void move()
	{
		System.out.println("ս���ƶ�");
	}
}


