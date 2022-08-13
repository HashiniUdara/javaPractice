import java.util.Scanner;
public class RecordSingle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StudentRecord sr=new StudentRecord();
		//input section
		System.out.print("Enter Student name           : ");
		sr.StudentName=sc.next();
		System.out.print("Enter Student index          : ");
		sr.Index=sc.next();
		System.out.print("Enter Student practical marks: ");
		sr.pMarks=sc.nextByte();
		System.out.print("Enter Student theory marks   : ");
		sr.tMarks=sc.nextByte();
		//processing section
		sr.avg=(sr.pMarks+sr.tMarks)/2;
		//output section
		System.out.println();
		System.out.println("Display student record: ");
		System.out.println("-----------------------");
		System.out.println("Student name           \t\t\t: "+sr.StudentName);
		System.out.println("Student index          \t\t\t: "+sr.Index);
		System.out.println("Student practical marks\t\t\t: "+sr.pMarks);
		System.out.println("Student theory marks   \t\t\t: "+sr.tMarks);
		System.out.println("Student average        \t\t\t: "+sr.avg);		
	}
}
//java record structure
class StudentRecord{
	String StudentName;//field1
	String Index;      //field2
	byte pMarks;       //field3
	byte tMarks;       //field4
	float avg;         //field5
}