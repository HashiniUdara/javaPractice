import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the no of elements to the array : ");
		int elements=sc.nextInt();
		int X[]=new int[elements];
		System.out.println("Enter "+elements+" elements to the array.");
		for(int i=0;i<X.length;i++){
			System.out.print("("+(i+1)+")");
			X[i]=sc.nextInt();
		}
		System.out.println("Non sorted no list.");
		for(int i=0;i<X.length;i++){
			System.out.print(X[i]+"\t");
		}
		int temp=0;
		for(int j=0;j<X.length-1;j++){
			for(int i=j+1;i<X.length;i++){
				if(X[j]>X[i]){
					temp=X[j];
					X[j]=X[i];
					X[i]=temp;
				}
			}
		}
		System.out.println("\nSorted list.");
		for(int i=0;i<X.length;i++){
			System.out.print(X[i]+"\t");
		}
		System.out.print("\nEnter the value you want to search : ");
		int SearchValue=sc.nextInt();
		boolean searchOK=false;
		int startIndex=0;
		int lastIndex=X.length-1;
		int middleIndex=(startIndex+lastIndex)/2;
		int elementNo=0;
		do{
			if(X[middleIndex]==SearchValue){
				searchOK=true;
				elementNo=middleIndex;
				break;
			}else{
				if(X[middleIndex]<SearchValue){
					startIndex=middleIndex+1;
					lastIndex=lastIndex;	
				}else{
					startIndex=startIndex;
					lastIndex=middleIndex-1;
				}
				middleIndex=(startIndex+lastIndex)/2;
			}
		}while(startIndex<lastIndex+1);
			if(searchOK){
				System.out.println("the value "+SearchValue+" is in the array at index no "+elementNo);
			}else{
				System.out.println("the value "+SearchValue+" is not in the array. ");
			}
		
	}
}