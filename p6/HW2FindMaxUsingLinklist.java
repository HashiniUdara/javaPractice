		//MAKE MAX,MIN...VARIABLES IN class number

import java.util.Scanner;
public class HW2FindMaxUsingLinklist{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("howmany numbers: ");
		int noofno=sc.nextInt();
		number start=new number();
		number pointer=start;
		boolean b=true;
		int max=0;
		int min=0;
		float total=0;
		for(int i=1;i<=noofno;i++){
			System.out.print("Enter no "+i+" : ");
			pointer.no=sc.nextInt();

			if(b){
				max=pointer.no;
				min=pointer.no;
				total=pointer.no;
				b=false;
			}else{
				if(pointer.no>max){max=pointer.no;}
				if(pointer.no<min){min=pointer.no;}
				total=total+pointer.no;
			}
				pointer.d=new number();
				pointer=pointer.d;
		}
		float avg=total/noofno;
		pointer=start;
			System.out.println();
			System.out.println("max is "+max);
			System.out.println("min is "+min);
			System.out.println("avg is "+avg);
			pointer=pointer.d;
		
	}
}
class number{
	int no;
	number d=null;
}
