package Observer;

public class Coordinates {
    int x;
    int y;
    int z;

    @Override
    public String toString() {
        return "Coordinates{" + x +", " + y +", " + z + '}';
    }

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
