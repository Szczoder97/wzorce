package Proxy;

public class CopilotManager implements ICoPilot {

    private DroidCopilot copilot = null;
    @Override
    public void takeControlOverSpaceship() {
        if (this.copilot == null) {
            copilot = new DroidCopilot();
        }
        copilot.takeControlOverSpaceship();
    }
}
