package Proxy;

public class DroidCopilot implements ICoPilot {

    public DroidCopilot() {
        System.out.println("Copilot generated! Most of your resources have been consumed!");
    }

    @Override
    public void takeControlOverSpaceship() {
        System.out.println("Now I will take control over your ship.");
        System.out.println("This process is not resource consuming, enjoy your travel.");
    }
}
