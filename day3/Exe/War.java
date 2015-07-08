
public class War {
	public static void main(String[] args)
	{
		Army a=new Army(3);
		a.w[0]=new Tank();
		a.w[1]=new Flighter();
		a.w[2]=new Warship();
		a.attackAll();
		a.moveAll();
	}
}


