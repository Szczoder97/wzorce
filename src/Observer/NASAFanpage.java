package Observer;

public class NASAFanpage implements IObserver {
    private MoonStation station;

    public NASAFanpage(MoonStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("New interesting space object found at: " + station.getSpaceObjectCoordinates());
    }
}
