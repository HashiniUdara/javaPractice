import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    	public static void main(String[] args){
            System.out.println("Server is running...");
	        try{
		        ServerSocket ss=new ServerSocket(6666);
		        Socket s=ss.accept();//establishes connection
		        DataInputStream dis=new DataInputStream(s.getInputStream());
		        String str=(String)dis.readUTF();
		        System.out.println("The message Recieved from Client was= "+str);
		        s.close();
                ss.close();
	        }catch(Exception e){
            		System.out.println(e);
            }
	    }
}

