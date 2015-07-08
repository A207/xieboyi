package ∂‡Ã¨;
public class Fruit {
	public String toSTring()
	{
		return "fruit";
	}
}

class Apple extends Fruit
{
	public String toString()
	{
		return "apple";
	}
}

class Mango extends Fruit
{
	public String toString()
	{
		return "mango";
	}
	
}


class Juicer
{
	public void juice(Fruit fruit)
	{
		System.out.println("squeeze "+fruit);
		
	}
	
	public static void main(String[] args)
	{
		Juicer j=new Juicer();
		Fruit fruit=new Apple();	
		j.juice(fruit);
	}
}