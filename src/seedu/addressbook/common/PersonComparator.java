package seedu.addressbook.common;

import seedu.addressbook.data.person.Person;

import java.util.Comparator;

/**
 * Comparator class exclusively for comparing persons
 * in the address book by their names
 */
public class PersonComparator implements Comparator<Person>{
    public PersonComparator(){
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().toString().compareTo(o2.getName().toString());
    }
}
