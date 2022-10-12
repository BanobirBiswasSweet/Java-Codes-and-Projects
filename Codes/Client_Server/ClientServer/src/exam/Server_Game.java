package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Server_Game {

    private static ServerSocket server;
	private static Scanner sc;

	public static void main(String[] args) throws Exception {

        server = new ServerSocket(8080); 
        System.out.println("Active Server");
        HashMap<Integer,String> gababo = new HashMap<>();
        List<Socket> player = new ArrayList<Socket>();
        int count =0;
        while(true){
            Socket socket =server.accept(); 
            OutputStream out = socket.getOutputStream();
            DataOutputStream  dos = new DataOutputStream(out);
            player.add(socket);

            String players = player.get(count).toString();
            gababo.put(count, players);
            count++;
            System.out.println(count + "th player connet ");
            dos.writeUTF(count + "th player connet");
            dos.flush();
            
            if(gababo.size() >=2) {

                sc = new Scanner(System.in);
                System.out.println("2player Come");

                dos.writeUTF("Start");
                dos.writeUTF("1.scis 2.Rock 3.Paper ");
                dos.writeUTF(">>>>>");
                dos.flush();
                InputStream in = player.get(0).getInputStream();
                DataInputStream dis = new DataInputStream(in);
                int choice = dis.readInt();

                InputStream in2 = player.get(1).getInputStream();
                DataInputStream dis2 = new DataInputStream(in2);
                int choice2 = dis2.readInt() ;

                if(choice ==1) {

                    if(choice2 == 1) {
                        dos.writeUTF("draw.");
                        dos.flush();
                    }else if(choice2 == 2) {
                        dos.writeUTF("2play win.");
                        dos.flush();
                    }else if(choice2 == 3) {
                        dos.writeUTF("1play win.");
                        dos.flush();
                    }else {
                        dos.writeUTF("strenge number.");
                        dos.flush();
                    }
                }else if(choice ==2) {

                    if(choice2 == 1) {
                        dos.writeUTF("1play win");
                        dos.flush();
                    }else if(choice2 == 2) {
                        dos.writeUTF("draw.");
                        dos.flush();
                    }else if(choice2 == 3) {
                        dos.writeUTF("2play win.");
                        dos.flush();
                    }else {
                        dos.writeUTF("strenge number");
                        dos.flush();
                    }
                }else if(choice ==3){

                    if(choice2 == 1) {
                        dos.writeUTF("2player win.");
                        dos.flush();
                    }else if(choice2 == 2) {
                        dos.writeUTF("1player win.");
                        dos.flush();
                    }else if(choice2 == 3) {
                        dos.writeUTF("draw");
                        dos.flush();
                    }else {
                        dos.writeUTF("Strenge number");
                        dos.flush();
                    }                                   
                }
            }
        }
    }
}