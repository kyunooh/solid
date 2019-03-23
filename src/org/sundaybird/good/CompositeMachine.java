package org.sundaybird.good;

import org.sundaybird.common.Document;

public class CompositeMachine implements Printer, Fax, Scanner, CopyMachine{

    @Override
    public void send(Document document) {
        System.out.println("Send document" + document);
    }

    @Override
    public void copy() {
        Document document = scan();
        print(document);
    }

    @Override
    public Document scan() {
        return new Document();
    }

    @Override
    public void print(Document document) {
        System.out.println("Print document" + document);
    }
}
