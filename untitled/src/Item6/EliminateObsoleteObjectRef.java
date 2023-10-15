package Item6;

import java.util.ArrayList;
import java.util.List;
/**
 * But remember contary to the mention class point
 * Nulling out object refs should be the exception rather than the norm
 */

public class EliminateObsoleteObjectRef {

    List<String> stringList = new ArrayList<>();

    // Adding elements to the list
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

    // Using the list
        for (String s : stringList) {
        System.out.println(s);
    }

    // At this point, you might think the list is no longer needed,
    // but the reference 'stringList' still holds it.

    // Eliminating obsolete reference to allow garbage collection
    stringList = null;

    // Now, the list is no longer accessible through 'stringList',
    // and it is eligible for garbage collection.

    // Perform other operations...

    // The list is no longer needed in the program, so it can be
    // garbage collected.

    // More code...

    // The JVM can collect the list since it is no longer reachable.

    // It's important to set 'stringList' to null to eliminate the
    // reference so that the list can be collected by the JVM.
}
