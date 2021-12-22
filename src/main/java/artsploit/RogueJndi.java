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
        System.out.println(timestamp + "Restart");
        Config.applyCmdArgs(args);
        HttpServer.start();
        LdapServer.start();
    }
}
