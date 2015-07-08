package thisdemo;

public class Demo1 {

	
	public static void main(String[] args) {
		
        Person person=new Person("jim",21,"USA");
        person.introduce();
	}

}

class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	
	public Person(String name,int age,String address){
		this(name,age);
		this.address=address;	
	}
	void hello(){
		System.out.println("hello.....");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();
		//System.out.println(this);
	}
}
//this可以用在构造方法内部，用来区分同名的成员变量和局部变量
//this可以用于调用构造方法，减少代码冗余（在构造方法中通过this调用其他构造方法的语句必须是第一句）
//this可以用于调用成员属性和成员方法