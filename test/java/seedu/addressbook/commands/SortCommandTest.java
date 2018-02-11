package seedu.addressbook.commands;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.UniquePersonList;
import seedu.addressbook.util.TestUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortCommandTest {

    public void sortCommand_addressBookWithFiveElements_sortedAddressBook(){
        SortCommand sortCommand = new SortCommand();

        Person miguel = TestUtil.generateTestPerson("Miguel");
        Person suzanne = TestUtil.generateTestPerson("Suzanne");
        Person carley = TestUtil.generateTestPerson("Carley");
        Person genna = TestUtil.generateTestPerson("Genna");
        Person huey = TestUtil.generateTestPerson("Huey");

        AddressBook addressBook = TestUtil.createAddressBook(miguel,suzanne,carley,genna,huey);
        List<Person> sortedList = Arrays.asList(carley,genna,huey,miguel,suzanne);

        sortCommand.setData(addressBook, Collections.emptyList());
        sortCommand.execute();

        UniquePersonList personList = addressBook.getAllPersons();
        UniquePersonList expectedList = new UniquePersonList(personList);

        assertTrue(sortedList.equals(expectedList));
    }

}