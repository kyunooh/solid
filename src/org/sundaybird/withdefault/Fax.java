package org.sundaybird.withdefault;

import org.sundaybird.common.Document;

public interface Fax {
    default void send(Document document) {
        System.out.println("Send document" + document);
    }
}
