import java.util.Scanner;
public class exer2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your name:");
		String name=sc.nextLine();
		System.out.print("enter your age:");
		int age=sc.nextInt();
		System.out.println("hello "+name+" you are "+age+" years old.");
	} 

}