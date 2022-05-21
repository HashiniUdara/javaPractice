import java.util.Scanner;
import java.io.DataOutputStream;
import java.net.Socket;
public class Client {
	public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
	    System.out.print("Enter the message pass to the server : ");
	    String msg=sc.nextLine();
	    try{
		    Socket s=new Socket("",6500);
		    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		    dout.writeUTF(msg);
		    dout.flush();
		    dout.close();
		    s.close();
		    System.out.println("The message \""+msg+"\" was sent to the server.");
	    }catch(Exception e){
            System.out.println(e);
        }
    }
}
