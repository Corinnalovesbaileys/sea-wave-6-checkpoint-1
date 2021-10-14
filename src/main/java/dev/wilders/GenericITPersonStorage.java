package dev.wilders;

//Add another class GenericITPersonStorage, which restricts its usage for ITPerson and its subclasses.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericITPersonStorage<T extends ITPerson>   {
    List<T> itcrowd = new ArrayList<>();

    public GenericITPersonStorage() {

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
    // Test mit Typ String:
    /*public static void main(String[] args) {
        Admin hilde = new Admin("hase", LocalDate.now().minusMonths(3));
        String keinITMensch = "Geht-Nicht";
        GenericITPersonStorage genericITPersonStorage = new GenericITPersonStorage();
        genericITPersonStorage.storePerson(hilde);
        genericITPersonStorage.storePerson(keinITMensch);

    }*/
}


