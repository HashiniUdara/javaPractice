import java.util.Scanner;
public class HW1FindMaxUsingArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Howmany numbers you hope to enter: ");
		int noofno=sc.nextInt();
		int[] no=new int[noofno];
		int max=0;
		int min=0;
		float total=0;
		boolean b=true;
		for(int i=0;i<noofno;i++){
			System.out.print("no in element "+(i+1)+" : ");
			no[i]=sc.nextInt();
			if(b){
				total=no[0];	//total=no[i];
				min=no[0];
				max=no[0];
				b=false;
			}else{
				if(no[i]>max){max=no[i];}
				if(no[i]<min){min=no[i];}
				total=total+no[i];
			}
		}
		System.out.println();
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		float avg=total/noofno;
		System.out.println("average is "+avg);
	}
}