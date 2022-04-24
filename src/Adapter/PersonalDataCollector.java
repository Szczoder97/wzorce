package Adapter;

import java.util.ArrayList;
import java.util.List;

public class PersonalDataCollector {
    public ITarget dataParser;
    List<Person> people = new ArrayList<Person>();

    public PersonalDataCollector(ITarget dataParser) {
        this.dataParser = dataParser;
    }

   public void collect(List<Person> data) {
        for (var person : data) {
            people.add(person);
        }
    }
    public void displayData() {
        for (var person : people) {
            System.out.println(person.toString());
        }
    }
}
