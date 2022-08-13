import java.util.Scanner;
public class FindMaxExer{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("how many numbers do you want to enter: ");
		int noofno=sc.nextInt();
		int max=0;
		int min=0;
		float total=0;
		boolean b=true;
		int value;
		for(int i=1;i<=noofno;i++){
			System.out.print("enter no "+i+": ");
			value=sc.nextInt();
			if(b){
				max=value;
				min=value;
				//total=value;
				b=false;
			}else{
				if(value>max){max=value;}
				if(value<min){min=value;}
				
			}
			total=total+value;
		}
		//System.out.println();
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		float avg=total/noofno;
		System.out.println("average is "+avg);		
	}
}