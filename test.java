import java.lang.*;
abstract class SuperClass{
	private String argument;
	public SuperClass(String argument){
		this.argument=argument;
	}
	abstract void print(String argument);
}

interface interface1{
	print(String argument); //隐式抽象
}

class SubClass1 extends SuperClass{
	public SubClass1(String argument) {
		super(argument);
	}

	void print(String argument){
  		System.out.println(argument);
	}
}

class SubClass2 extends SuperClass{
	public SubClass2(String argument) {
		super(argument);
	}
	void print(String argument){
  		System.out.println(argument);
	}
}

class SubClass3 implements interface1{
	String argument;
	public SubClass3(String argument) {
		this.argument=argument;
	}
	public void print(String argument) {
  		System.out.println(argument);
	}
}

public class test{
	public static void main(String[] args){
		SubClass1 first=new SubClass1("子函数一的参数");
		SubClass2 second=new SubClass2("子函数二的参数");
		SubClass3 third=new SubClass3("接口");
  		first.print("子函数一的参数");
  		second.print("子函数二的参数");
		third.print("接口");
    }
}