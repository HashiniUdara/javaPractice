import java.util.Scanner;
public class arraystructure3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements to the array:");
		int element=sc.nextInt();
		int[] no=new int[element];//declare
		for(int index=0;index<no.length;index++){//i===index
			System.out.println("enter an integer value for element "+(index+1)+" : ");
			no[index]=sc.nextInt();//initializing
		}
		//display values in each element in the array
		for(int index=0;index<no.length;index++){
			System.out.println("the values in the "+(index+1)+"element is "+no[index]);//using
		}
			
	}
}