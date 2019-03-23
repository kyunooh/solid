package org.sundaybird.bad;

import org.sundaybird.common.Document;

public class CompositeMachine {
    public void sendFax(Document document) {
        System.out.println("Send document" + document);
    }

    public void copyDocument() {
        Document document = scanDocument();
        print(document);
    }

    public Document scanDocument() {
        return new Document();
    }

    public void print(Document document) {
        System.out.println("Print document" + document);
    }
}
