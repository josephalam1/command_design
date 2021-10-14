/**
 * IDontKnowCommand class that handles executing the I Don't Know song
 * @author Joseph Alam
 */
public class InArmyCommand implements Command {
    private MilitaryCadence cadence;
    /**
     * Initializes the InArmyCommand
     * @param cadence Cadence object that will handle displaying the lyrics when executed
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Execute - handles playing the I Don't Know song
     */
    public void execute() {
        cadence.singInArmy();
    }
}

