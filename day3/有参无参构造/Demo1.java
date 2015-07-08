package methoddemo;

public class Demo1 {
	String name;
	int age;
	String address;
	/*//无参默认构造方法
	Demo1(){}*/
	//有参构造方法
	Demo1(String n,int a,String add){
		name=n;
		age=a;
		address=add;
	}
	
	void introduce(){
		System.out.println("大家好，我叫"+name+"，我今年"+age+"岁了，我家在"+address);
	}
	public static void main(String[] args) {
		
		System.out.println("lalala");
		
		Demo1 person=new Demo1("jim",20,"北京");
		
		person.introduce();
	

	}

}
