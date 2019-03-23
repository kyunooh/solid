package org.sundaybird.withdefault;

import org.sundaybird.common.Document;

public interface CopyMachine extends Scanner, Printer {
    default void copy() {
        Document document = scan();
        print(document);
    }
}
