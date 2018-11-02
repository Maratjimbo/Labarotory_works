import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) {


        try	(ServerSocket server= new ServerSocket(3345)){
            String clientName;
            System.out.println("Waiting for client connection");
            Socket client = server.accept();
            System.out.println("Client is connected");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Available command: \n@name Name - Enter your name\nMessage - Send message\n@quit - Disconnect");
            out.flush();
            while(!client.isClosed()){
                System.out.println("Server waiting message from client");
                String clientMessage= in.readUTF();
                System.out.println("Message from client: " + clientMessage);
                if(clientMessage.equalsIgnoreCase("@quit")){
                    System.out.println("Client initialize connections suicide");
                    out.writeUTF("Connection terminated");
                    break;
                }
                if(clientMessage.regionMatches(0, "@name", 0, 5))
                {
                    clientName = String.copyValueOf(clientMessage.toCharArray(), 6, clientMessage.length() - 6);
                    out.writeUTF("Now your name on server: " + clientName);
                    out.flush();
                    continue;
                }
                System.out.println("Enter message to client");
                String commandLine = reader.readLine();
                out.writeUTF(commandLine);
                System.out.println("Server wrote message to client.");
                out.flush();
            }

            System.out.println("Client disconnected");
            in.close();
            out.close();
            client.close();
            server.close();
            System.out.println("All connections was closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}