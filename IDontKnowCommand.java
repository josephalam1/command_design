import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.concurrent.*;

/**
 * IDontKnowCommand class that handles executing the I Don't Know song
 * @author Joseph Alam
 */
public class IDontKnowCommand implements Command {

    /**
     * Execute - handles playing the I Don't Know song
     */
    public void execute() {
        try {
            File myObj = new File("idontknow.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            try {
                System.out.println(data);
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } 
            catch (InterruptedException e) {
                System.out.println("There was an error while sleeping");
            }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

