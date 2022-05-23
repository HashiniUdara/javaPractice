public class nightprac{
	public static void main(String[] args){
	B b=new B();
	C c=new c();
	c.settQ(b.gotqty());
	System.out.println("the value is "+c.Q);
	}


}
class B{
	public float qty=10;
	public float gotqty(){
		return qty;
	}
}
class C{
	public float Q;
	public void settQ(float t){
		Q=t;
	}
}