public class Army
{
	public Weapon[] w;
	
	Army(int a)
	{
		w=new Weapon[a];	
	}
	
	public void AddWeapon(Weapon wa)
	{
		//add weapon
	}
	
	public void attackAll()
	{
		for(int i=0;i<w.length;i++)
		{
			w[i].attack();
		}
	}
	
	public void moveAll()
	{
		for(int i=0;i<w.length;i++)
		{
			w[i].move();
		}
	}
	
}