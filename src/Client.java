import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//pour lire à partir du clavier

        
        try{
           Socket clientSocket = new Socket("127.0.0.1",6020);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            int cpt = 0;
            String message_client = "message";
            String message_client2;
            while(cpt<10){
                message_client = "message" + cpt ;
                out.println(message_client);
                out.flush();
                cpt++;
                //message_client2 = sc.nextLine();
                

 
            }    
        
        }
        catch (IOException e) {
            e.printStackTrace();

        }



        
    }
}
