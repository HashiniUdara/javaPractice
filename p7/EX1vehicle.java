import java.util.Scanner;
public class EX1vehicle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//input section
		System.out.print("How many vehical details you have to enter: ");
		int NoOfVehicals=sc.nextInt();
		VehicalRecord[] vr=new VehicalRecord[NoOfVehicals];
		System.out.println("\t\tEnter vehical records             : ");
		System.out.println("\t\t-----------------------");
		
		for(int i=0;i<NoOfVehicals;i++){
			vr[i]=new VehicalRecord();//insert VehicalRecord object for each element of the array
			System.out.println();
			System.out.println("enter details to record "+(i+1)+": ");
			System.out.println("----------------------------");
			System.out.print("\tEnter Owners' name    : ");
			vr[i].OwnerName=sc.next();
			System.out.print("\tEnter OwnerID         : ");
			vr[i].OwnerID=sc.next();
			System.out.print("\tEnter vehical No      : ");
			vr[i].VehicalNo=sc.next();
			System.out.print("\tEnter Vehical model   : ");
			vr[i].VehicalModel=sc.next();
			System.out.print("\tEnter Vehical color   : ");
			vr[i].VehicalColor=sc.next();
			System.out.print("\tEnter PRICE           : ");
			vr[i].Price=sc.nextFloat();	
		}
		/*System.out.println();
		System.out.println("Display students records: ");
		for(int i=0;i<NoOfVehicals;i++){
			System.out.println("-----------------------");
			System.out.println("Owner Name is    "+vr[i].OwnerName);
			System.out.println("Owner ID is      "+vr[i].OwnerID);
			System.out.println("Vehicle No is    "+vr[i].VehicalNo);
			System.out.println("Vehicle Model is "+vr[i].VehicalModel);
			System.out.println("vehicle Color is "+vr[i].VehicalColor);
			System.out.println("Price is         "+vr[i].Price);
		}*/
		VehicalRecord temp=new VehicalRecord();
		for(int j=0;j<NoOfVehicals;j++){
			for(int i=1;i<NoOfVehicals-j;i++){
				if(vr[i-1].Price>vr[i].Price){
					temp=vr[i-1];
					vr[i-1]=vr[i];
					vr[i]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("SORTED LIST:");
		System.out.println();
		System.out.println("OWNER ID\tVEHICAL NO\tVEHICAL MODEL\tVEHICAL COLOR\tPRICE");
		for(int i=0;i<NoOfVehicals;i++){
			System.out.println();
			System.out.println(vr[i].OwnerID+"\t\t"+vr[i].VehicalNo+"\t\t"+vr[i].VehicalModel+"\t\t"+vr[i].VehicalColor+"\t\t"+vr[i].Price);
		}
		
		System.out.println();
		int find_method;
		System.out.println("if ID;no=1 or if VehicalNo;no=2 : ");
		find_method=sc.nextInt();
		boolean found=false;
		int elementno=0;
		if(find_method==1){
			System.out.print("enter the owner ID of the vehical u want to find: ");
			String ID=sc.next();
			for(int i=0;i<NoOfVehicals;i++){
				if(ID.equals(vr[i].OwnerID)){
					found=true;
					elementno=(i+1);
					break;
				}
			}
		}else if(find_method==2){
			System.out.println("enter vehical no : ");
			String vehicalno=sc.next();
			for(int i=0;i<NoOfVehicals;i++){
				if(vehicalno.equals(vr[i].VehicalNo)){
					found=true;
					elementno=(i+1);
					break;
				}
			}
		}
		System.out.println();
		if(found)
			System.out.println("Found.\nIt is in the element "+elementno+".");	
		else
			System.out.println("Sorry,Not in our records.");	
	}
}
class VehicalRecord{
	String OwnerName;
	String OwnerID;
	String VehicalNo;
	String VehicalModel;
	String VehicalColor;
	float Price;
	
}