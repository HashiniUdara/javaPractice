import java.util.Scanner;
public class sorting1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("how many elements : ");
		int elements=sc.nextInt();
		int[] no=new int[elements];
		for(int i=0;i<elements;i++){
			System.out.print("enter no to element "+(i+1)+" :" );
			no[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("none sorted elements are:");
		for(int i=0;i<elements;i++){
			System.out.print("  "+no[i]);
		}
		//.............................................
		//bubble sort code segment
		/*int temp=0;
		for(int j=0;j<no.length;j++){
			for(int i=1;i<no.length-j;i++){
				if(no[i-1]>no[i]){
					temp=no[i-1];
					no[i-1]=no[i];
					no[i]=temp;
				}
			}
		}*/
		//............................................
		//insertion sort
		int temp=0;
		for(int j=0;j<no.length-1;j++){
			for(int i=j+1;i<no.length;i++){
				if(no[j]>no[i]){
					temp=no[j];
					no[j]=no[i];
					no[i]=temp;
				}
			}
		}
		//.............................................
		System.out.println();
		System.out.println("sorted elements are:");
		for(int i=0;i<elements;i++){
			System.out.print("  "+no[i]);
		}
	}
}