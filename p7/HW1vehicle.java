                //NOT COMPLEATED _______SORT

import java.util.Scanner;
public class HW1vehicle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		VehicleDetails vd=new VehicleDetails();
		VehicleDetails start=new VehicleDetails();
		VehicleDetails pointer=start;
		System.out.print("How many vehicles: ");
		int noofV=sc.nextInt();
		System.out.println();
		for(int i=0;i<noofV;i++){
			System.out.println("NO "+(i+1)+" DETAIL PACK");
			System.out.print("\tEnter ID no : ");
			pointer.IDNO=sc.next();
			System.out.print("\tEnter Model : ");
			pointer.MODEL=sc.next();
			System.out.print("\tEnter Price : ");
			pointer.PRICE=sc.nextFloat();
			pointer.V=new VehicleDetails();
			pointer=pointer.V;
		}
		pointer=start;
		VehicleDetails temp=start;
		for(int j=0;j<noofV;j++){
			for(int i=1;i<noofV-j;i++){
				if(pointer.PRICE>pointer.V.PRICE){     ...........................
				start=pointer.V;
					
				}
				pointer=pointer.V;
			}
		}

		pointer=start;
		System.out.println();
		for(int i=0;i<noofV;i++){
			System.out.println();
			System.out.println(pointer.IDNO+"\t"+pointer.MODEL+"\t"+pointer.PRICE);
			pointer=pointer.V;
		}
		pointer=start;
		System.out.print("IDNo u want to search: ");
		String IDNo=sc.next();
		boolean found=false;
		for(int i=0;i<noofV;i++){
			if(IDNo.equals(pointer.IDNO)){
				found=true;
			}
			pointer=pointer.V;
		}
		System.out.println();
		if(found)
			System.out.println("It is in our records.");
		else
			System.out.println("Not in our records.");
		
	}
}
class VehicleDetails{
	String IDNO;
	String MODEL;
	float PRICE;
	VehicleDetails V=null;
}