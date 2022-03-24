import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6020);
        System.out.println("START");

        Socket socket = serverSocket.accept();
        BufferedReader ins = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter outs = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        String message_client = "message" ;
        while(message_client !=null){
           message_client = ins.readLine();
           System.out.println("Client : "+message_client);
           String s;
           s = "reçu";
           outs.println(s);
           outs.flush(); 
        }
        
        

        ins.close();
        outs.close();
        socket.close();
        serverSocket.close();
    }
}