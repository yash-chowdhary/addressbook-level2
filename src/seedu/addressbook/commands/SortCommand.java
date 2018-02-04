package seedu.addressbook.commands;

/**
 * Sorts all the data in the address book in alphabetical order of Name
 */
public class SortCommand extends Command{
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book in alphabetical order of their name.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "All persons in address book sorted by name";
    public static final String MESSAGE_FAILURE = "Unable to sort persons in address book.";

    @Override
    public CommandResult execute() {
        if(!addressBook.sort()){
            return new CommandResult(MESSAGE_FAILURE);
        }
        return new CommandResult(MESSAGE_SUCCESS);

    }
}
