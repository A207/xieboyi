package methoddemo;

public class Demo1 {
	String name;
	int age;
	String address;
	/*//�޲�Ĭ�Ϲ��췽��
	Demo1(){}*/
	//�вι��췽��
	Demo1(String n,int a,String add){
		name=n;
		age=a;
		address=add;
	}
	
	void introduce(){
		System.out.println("��Һã��ҽ�"+name+"���ҽ���"+age+"���ˣ��Ҽ���"+address);
	}
	public static void main(String[] args) {
		
		System.out.println("lalala");
		
		Demo1 person=new Demo1("jim",20,"����");
		
		person.introduce();
	

	}

}
