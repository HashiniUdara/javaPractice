import java.util.Scanner;
public class javaRrecordArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//input section
		System.out.print("How many students you have to enter: ");
		int NoOfStudents=sc.nextInt();
		StudentRecord[] sr=new StudentRecord[NoOfStudents];
		System.out.println("Enter students records             : ");
		System.out.println("-----------------------");
		
		for(int i=0;i<NoOfStudents;i++){
			sr[i]=new StudentRecord();//insert StudentRecord object for each element of the array
			System.out.println();
			System.out.println("enter value for record "+i+": ");
			System.out.println("----------------------------");
			System.out.print("Enter Student name           : ");
			sr[i].StudentName=sc.next();
			System.out.print("Enter Student index          : ");
			sr[i].Index=sc.next();
			System.out.print("Enter Student practical marks: ");
			sr[i].pMarks=sc.nextByte();
			System.out.print("Enter Student theory marks   : ");
			sr[i].tMarks=sc.nextByte();
			//processing section
			sr[i].avg=(sr[i].pMarks+sr[i].tMarks)/2;
		}
		//output section
		System.out.println();
		System.out.println("Display students records: ");
		for(int i=0;i<NoOfStudents;i++){
			System.out.println("-----------------------");
			System.out.println("Student name           \t\t\t: "+sr[i].StudentName);
			System.out.println("Student index          \t\t\t: "+sr[i].Index);
			System.out.println("Student practical marks\t\t\t: "+sr[i].pMarks);
			System.out.println("Student theory marks   \t\t\t: "+sr[i].tMarks);
			System.out.println("Student average        \t\t\t: "+sr[i].avg);
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
}