
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

class Client {
    public static void main(String[] args) {
        int PORT;
        Logger logger = Logger.getLogger(Client.class.getName());
        logger.info("Enter the port of server: ");
        Scanner scanner = new Scanner(System.in);
        PORT = scanner.nextInt();
        try(Socket socket = new Socket("localhost", PORT);
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
            DataInputStream ois = new DataInputStream(socket.getInputStream())	)
        {

            logger.info("Server connection established");
            String in = ois.readUTF();
            logger.info(in);
            logger.info("Enter your message to server:");
            while(!socket.isOutputShutdown()){
                if(br.ready()){
                    String clientCommand = br.readLine();
                    oos.writeUTF(clientCommand);
                    oos.flush();
                    logger.info("Client sent message to server");

                    if(clientCommand.equalsIgnoreCase("@quit")){
                        logger.info("Disconnect from server");
                        logger.info("Message from server:");
                        in = ois.readUTF();
                        logger.info(in);
                        break;
                    }
                    logger.info("Wait message from server");
                    in = ois.readUTF();
                    logger.info("Message from server: " + in);
                    logger.info("Enter your message to server:");
                }
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}