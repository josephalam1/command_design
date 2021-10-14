/**
 * IDontKnowCommand class that handles executing the I Don't Know song
 * @author Joseph Alam
 */
public class EverywhereCommand implements Command {
    private MilitaryCadence cadence;
    /**
     * Initializes the EverywhereCommand
     * @param cadence Cadence object that will handle displaying the lyrics when executed
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Execute - handles playing the I Don't Know song
     */
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}

