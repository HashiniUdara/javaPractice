import java.util.Scanner;
public class Arraystructures5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements for arrays in X axis: ");
		int i=sc.nextInt();
		System.out.print("enter the number of elements for arrays in Y axis: ");
		int j=sc.nextInt();
		int[][] no1=new int[i][j];//declare
		int[][] no2=new int[i][j];//declare
		int[][] sum=new int[i][j];//declare
		System.out.println();//for blank line
		System.out.println("enter the no of elements for array 1: ");
		for(int x=0;x<i;x++){
			for(int y=0;y<j;y++){
				System.out.print("enter a value for element "+x+" , "+y+" : " );
				no1[x][y]=sc.nextInt();//initializing
			}
		}
		System.out.println();
		System.out.println("enter the number of elementsfor array 2 :");
			for(int x=0;x<i;x++){
				for(int y=0;y<j;y++){
					System.out.print("enter a value for element"+x+","+y+" : ");
					no2[x][y]=sc.nextInt();//initializing	
				}
			}
			for(int x=0;x<i;x++){
				for(int y=0;y<j;y++){
					sum[x][y]=no1[x][y]+no2[x][y];
				}
			}
			//for(int y=o;y<j;y++){
			//	sum[x][y]=no1[x][y]+no2[x][y];
			//}
			System.out.println();//for blank line
			System.out.println("the result array valus are: ");
			for(int x=0;x<i;x++){
				for(int y=0;y<j;y++){
					System.out.print(sum[x][y]+" ");
				}
			}			
	}
}