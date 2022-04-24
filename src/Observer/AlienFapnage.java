package Observer;

public class AlienFapnage implements IObserver {
    private MoonStation station;

    public AlienFapnage(MoonStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("It is possible that we found an alien at: " + station.getSpaceObjectCoordinates());
    }
}
