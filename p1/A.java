public class A{
	public static void main(String[] args){
		System.out.println("hello-1");
		greeting();
		B b=new B();
		b.greeting2();
		b.c.greeting3();
		
	}
	public static void greeting(){
		System.out.println("hello,have a nice day");
		C c=new C();
		c.greeting3();
	}	
}
class B{
	C c=new C();
	
	public void greeting2(){
		System.out.println("have a good day to you");
	}
}
class C{
	public void greeting3(){
		System.out.println("happy hours");
	}
}
class D{

}