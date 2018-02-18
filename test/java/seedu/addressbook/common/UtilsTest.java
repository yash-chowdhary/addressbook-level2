package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    @Test
    public void elementsAreNull() throws Exception {
        // empty list
        assertNotNull();

        // all objects are null
        assertNull(null, null, null);
        assertNull(null,null);

        // not all objects are null
        assertNull("1234", null, "abc");
        assertNull("test","object", true, null);

        // all non-null objects
        assertNotNull(1.23, 2, "dcba", true, false);
        assertNotNull(42, 'c', false);

    }

    private void assertNull(Object... objects) {    assertTrue(Utils.isAnyNull(objects));    }

    private void assertNotNull(Object... objects) { assertFalse(Utils.isAnyNull(objects));    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
}
