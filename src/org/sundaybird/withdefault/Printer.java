package org.sundaybird.withdefault;

import org.sundaybird.common.Document;

public interface Printer {
    default void print(Document document) {
        System.out.println("Print document" + document);
    }
}
