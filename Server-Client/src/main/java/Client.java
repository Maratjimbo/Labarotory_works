import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

class Client {
    public static void main(String[] args) {
        int PORT;
        System.out.println("Enter the port of server: ");
        Scanner scanner = new Scanner(System.in);
        PORT = scanner.nextInt();
        try(Socket socket = new Socket("localhost", PORT);
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
            DataInputStream ois = new DataInputStream(socket.getInputStream())	)
        {

            System.out.println("Server connection established");
            String in = ois.readUTF();
            System.out.println(in);
            System.out.println("Enter your message to server:");
            while(!socket.isOutputShutdown()){
                if(br.ready()){
                    String clientCommand = br.readLine();
                    oos.writeUTF(clientCommand);
                    oos.flush();
                    System.out.println("Client sent message to server");

                    if(clientCommand.equalsIgnoreCase("@quit")){
                        System.out.println("Disconnect from server");
                        System.out.println("Message from server:");
                        in = ois.readUTF();
                        System.out.println(in);
                        break;
                    }
                    System.out.println("Wait message from server");
                    in = ois.readUTF();
                    System.out.println("Message from server: " + in);
                    System.out.println("Enter your message to server:");
                }
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}