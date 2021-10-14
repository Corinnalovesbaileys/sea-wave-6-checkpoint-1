package dev.wilders;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<ITPerson> {
    // and can only add ITPerson or subclasses of it. See ITPersonStorage and create a new class GenericStorage,
    // which can be generified with ITPerson, so that this is possible:
    //List<ITPerson> itcrowd = new ArrayList<>();

    List<ITPerson> itcrowd = new ArrayList<>();

    public GenericStorage() {

    }

    public boolean storePerson(ITPerson person) {
        return itcrowd.add(person);
    }
    public ITPerson getLastStoredPerson() {
        return itcrowd.get(itcrowd.size()-1);
    }

    public ITPerson getFirstStoredPerson() {
        return itcrowd.get(0);
    }
}
