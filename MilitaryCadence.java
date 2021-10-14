import java.util.Scanner; //imports scanner so the program can read the file
import java.util.concurrent.TimeUnit; // imports TimeUnit to display the lyrics for a certain amount of time
import java.io.*;// allows import of the files
/**
 * class that displays the lyrics the songs
 * @author Joe Foray
 */
public class MilitaryCadence {
    public MilitaryCadence(){

    }
    /**
     * displays the lyrics to I Dont Know
     */
    public void singIDontKnow(){
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
    /**
     * displays the lyrics for Everywhere We Go
     */
    public void singEverywhereWeGo(){
        try {
            File myObj = new File("everywhere.txt");
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
    /**
     * displays the lyrics to in army
     */
    public void singInArmy(){
        try {
            File myObj = new File("inarmy.txt");
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
