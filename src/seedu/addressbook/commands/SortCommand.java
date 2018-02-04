package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorts all the data in the address book in alphabetical order of Name
 */
public class SortCommand extends Command{
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book in alphabetical order of their name.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "All persons in address book sorted by Name";
    public static final String MESSAGE_EMPTY_BOOK = "No persons in address book to sort.";

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        if(allPersons.isEmpty()){
            return new CommandResult(MESSAGE_EMPTY_BOOK);
        }
        Collections.sort(allPersons, new Comparator<ReadOnlyPerson>() {
            @Override
            public int compare(ReadOnlyPerson o1, ReadOnlyPerson o2) {
                return o1.getName().toString().compareTo(o2.getName().toString());
            }
        });

        return new CommandResult(MESSAGE_SUCCESS);

    }
}
