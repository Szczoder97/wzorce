package Decorator;

public class BeatsSoundSystem extends CarAccesoriesDecorator {
    private Car car;

    public BeatsSoundSystem(Car car) {
        this.car = car;
    }

    @Override
    public String name() {
        return car.name() + " with \"Beats\" sound system";
    }

    @Override
    public double price() {
        return car.price() + 2300F;
    }

    @Override
    public String description() {
        return car.description() + " Great Beats sound system!";
    }
}
