package seedu.addressbook.data.person;

/**
 * Represents a person's contact in the address book.
 * Behaves as superclass of Phone, Email and Address classes
 */
public class Contact {
    public String value;
    protected boolean isPrivate;

    public Contact(){
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public boolean isPrivate() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }

}
