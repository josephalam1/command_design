import java.util.ArrayList;

public class InputHandler {

    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence){
        commands = new ArrayList<Command>();
        Command command1 = new IDontKnowCommand();
        Command command3 = new EverywhereCommand();
        Command command2 = new InArmyCommand();
        commands.add(command1);
        commands.add(command2);
        commands.add(command3);
    }
    public boolean playCadence(int num){
        if (num >-1 && num < 4){
            commands.get(num).execute();
            return true;
        }
        else{
            return false;
        }
    }
}
