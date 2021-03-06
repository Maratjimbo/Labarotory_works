import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

class Server {
    public static void main(String[] args) {
        try	(ServerSocket server= new ServerSocket(33333)){
            String clientName = "";
            boolean flagForName = false;
            Logger logger = Logger.getLogger(Server.class.getName());
            logger.info("Waiting for client connection");
            Socket client = server.accept();
            logger.info("Client is connected");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Available command: \n@name Name - Enter your name\nMessage - Send message\n@quit - Disconnect");
            out.flush();
            while(!client.isClosed()){
                if(flagForName) {
                    logger.info("Server waiting message from " + clientName);
                }
                else{
                    logger.info("Server waiting message from client");
                }
                String clientMessage= in.readUTF();
                if(flagForName){
                    logger.info("Message from " + clientName + " : " + clientMessage);
                }
                else {
                    logger.info("Message from client : " + clientMessage);
                }
                if(clientMessage.equalsIgnoreCase("@quit")){
                    logger.info("Client initialize connections suicide");
                    out.writeUTF("Connection terminated");
                    break;
                }
                if(clientMessage.regionMatches(0, "@name", 0, 5))
                {
                    clientName = String.copyValueOf(clientMessage.toCharArray(), 6, clientMessage.length() - 6);
                    out.writeUTF("Now your name on server: " + clientName);
                    out.flush();
                    flagForName = true;
                    continue;
                }
                if(flagForName){
                    logger.info("Enter your message to " + clientName);
                }
                else {
                    logger.info("Enter your message to client : ");
                }
                String commandLine = reader.readLine();
                out.writeUTF(commandLine);
                if(flagForName) {
                    logger.info("Server wrote message to " + clientName);
                }
                else{
                    logger.info("Server wrote message to client.");
                }
                out.flush();
            }

            logger.info("Client disconnected");
            in.close();
            out.close();
            client.close();
            server.close();
            logger.info("All connections was closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}