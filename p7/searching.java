import java.util.Scanner;
public class searching{
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
		System.out.println();
		System.out.println("what is the value u want to search? ");
		int value=sc.nextInt();
		//..............................................
		//sequentionalsearching method
		boolean found=false;
		int elementno=0;
		for(int i=0;i<no.length;i++){
			if(value==no[i]){
				found=true;
				elementno=i;
				break;
			}
		}
		if(found)
			System.out.println("value "+value+" in the array at "+elementno);
		else
			System.out.println("value "+value+" is not in the array");
		//....................................................................
	}
}