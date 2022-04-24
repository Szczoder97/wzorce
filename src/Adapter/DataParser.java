package Adapter;


import java.util.stream.Collectors;

public class DataParser implements ITarget {
    private Data data;

    public DataParser(Data data) {
        this.data = data;
    }

    @Override
    public void request() {
        data.getData().stream().map(x -> {
            var credentials = x.split(", ");
            return new Person(credentials[0], credentials[1], Integer.parseInt(credentials[2]));
        }).collect(Collectors.toList());
    }
}