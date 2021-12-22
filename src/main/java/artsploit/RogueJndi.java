package artsploit;

import java.sql.Timestamp;

public class RogueJndi {

    public static void main(String[] args) throws Exception {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(
            "+-+-+-+-+-+-+-+-+-+\n" +
            "|R|o|g|u|e|J|n|d|i|\n" +
            "+-+-+-+-+-+-+-+-+-+"
        );
        System.out.println(timestamp + " Startup");
        Config.applyCmdArgs(args);
        HttpServer.start();
        LdapServer.start();
         Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp2 + " Ready to server requests");
    }
}
