import java.util.Scanner;
public class JavaRecordsWithReferancePointers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//input section
		System.out.print("How many students you have to enter: ");
		int NoOfStudents=sc.nextInt();
		StudentRecord top=new StudentRecord();
		StudentRecord go = top;
		System.out.println("	  Enter students records        : ");
		System.out.println("      ----------------------");
		
		for(int i=0;i<NoOfStudents;i++){
			//go=new StudentRecord();______THIS IS WRONG
			System.out.println();
			System.out.println("	enter value for record "+i+": ");
			System.out.println("	----------------------------");
			System.out.print("Enter Student name           : ");
			go.StudentName=sc.next();
			System.out.print("Enter Student index          : ");
			go.Index=sc.next();
			System.out.print("Enter Student practical marks: ");
			go.pMarks=sc.nextByte();
			System.out.print("Enter Student theory marks   : ");
			go.tMarks=sc.nextByte();
			//processing section
			go.avg=(go.pMarks+go.tMarks)/2;
			System.out.println();
			go.p=new  StudentRecord();
			go = go.p;	
		}
		//output section
		System.out.println();
		System.out.println("Display students records: ");
		System.out.println("NAME\t\tINDEX\t\tP_MARKS\t\tT_MARKS\t\tAVG");
		System.out.println();
		go=top;
		System.out.println("ok"+go.StudentName);
		for(int i=0;i<NoOfStudents;i++){
			System.out.println(go.StudentName+"\t\t "+go.Index+" \t\t  "+go.pMarks+"\t\t  "+go.tMarks+"\t\t"+go.avg);
			go=go.p;
		}		
	}
}
//java record structure
class StudentRecord{
	String StudentName;//field1
	String Index;      //field2
	byte pMarks;       //field3
	byte tMarks;       //field4
	float avg;         //field5
	StudentRecord p =null;
}