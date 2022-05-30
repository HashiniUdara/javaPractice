import java.util.Scanner;
public class Arraystructure2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] no=new int[5];//declare
		for(int i=0;i<no.length;i++){//i===index
			System.out.println("enter an integer value for element "+(i+1)+" : ");
			no[i]=sc.nextInt();//initializing
		}
		//display values in each element in the array
		for(int i=0;i<=no.length-2;i++){
			System.out.println("the values in the "+(i+1)+"element is "+no[i]);//using
		}
			
	}
}