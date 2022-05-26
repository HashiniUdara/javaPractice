public class todayx{
	public static void main(String[] args){
	B b=new B();
	C c=new C();
	D d=new D();
	d.settotal(b.getprice(),c.getnoofitems());
	System.out.println("the total value is"+d.total);


}

}
class B{
	public float price=10.50f;
	public float getprice(){
		return price;
	}
}
class C{
	public int noofitems=15;             //double
	public int getnoofitems(){
		return noofitems;
	}		
}
class D{
	public float total;
	public void settotal(float f,int i){
		total=f*i;

	}
}