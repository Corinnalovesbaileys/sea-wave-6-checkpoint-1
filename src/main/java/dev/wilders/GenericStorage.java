package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    // and can only add ITPerson or subclasses of it. See ITPersonStorage and create a new class GenericStorage,
    // which can be generified with ITPerson, so that this is possible:
    //List<ITPerson> itcrowd = new ArrayList<>();

    List<T> itcrowd = new ArrayList<>();

    public GenericStorage() {

    }

    public boolean storePerson(T person) {
        return itcrowd.add(person);
    }
    public T getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public T getFirstStoredPerson() {
        return itcrowd.get(0);
    }
}
