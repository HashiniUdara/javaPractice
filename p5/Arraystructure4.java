import java.util.Scanner;
public class Arraystructure4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements for X axis:");
		int i=sc.nextInt();
		System.out.print("enter the number of elements for Y axis:");
		int j=sc.nextInt();
		int[][] no=new int[i][j];//declare
		for(int y=0;y<j;y++){
			for(int x=0;x<i;x++){
			System.out.println("enter a value for element "+y+" , "+x+" : " );
			no[y][x]=sc.nextInt();//initializing
			}
		}
		//display values in each element in the array
		System.out.println("the values in the array are :");
			//for(int y=0;y<j;y++){
			//	for(int x=0;x<i;x++){
			//		System.out.print(" "+no[y][x]);//using
			//	}
			//	System.out.println();
			//}
			for(int y=j-1;y>-1;y--){
				for(int x=i-1;x>-1;x--){
					System.out.print(" "+no[y][x]);//using
				}
				System.out.println();
			}			
	}
}