package scripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessExec {

    public static void main(String[] args) {
        String s = null;
        String input = "audio_example.mp3";
        try {
            // Process provides control of native processes started by ProcessBuilder.start and Runtime.exec.
            // getRuntime() returns the runtime object associated with the current Java application.
            //Process p = Runtime.getRuntime().exec("spleeter separate -p spleeter:5stems -o output " + input);
            Process p = Runtime.getRuntime().exec("spleeter separate -p spleeter:2stems -o output audio_example.mp3" );
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            System.exit(0);
        } catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
