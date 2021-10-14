import java.util.ArrayList;
/**
 * Chooses a command to use from an array list of commands
 * @author Ben dela Pena
 */
public class InputHandler {

    private ArrayList<Command> commands;
   /**
    * Creates the different commands and adds them to an array list of commands
    * @param cadence To play the song
    */
    public InputHandler(MilitaryCadence cadence){
        commands = new ArrayList<Command>();
        Command command1 = new IDontKnowCommand(cadence);
        Command command3 = new EverywhereCommand(cadence);
        Command command2 = new InArmyCommand(cadence);
        commands.add(command1);
        commands.add(command2);
        commands.add(command3);
    }
    /**
     * Checks if the user input is valid and exectues the command
     * @param num the choice of the user of the command
     * @return true if valid and exectued and false if not
     */
    public boolean playCadence(int num){
        if (num >=0 && num < 3){
            commands.get(num).execute();
            return true;
        }
        else{
            return false;
        }
    }
}
