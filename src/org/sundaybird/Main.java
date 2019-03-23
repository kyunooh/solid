package org.sundaybird;

import org.sundaybird.common.Document;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    org.sundaybird.bad.CompositeMachine bad = new org.sundaybird.bad.CompositeMachine();
		System.out.println("=========BAD========");
		Document doc = new Document();
		bad.print(doc);
		bad.sendFax(doc);

	    org.sundaybird.good.CompositeMachine good = new org.sundaybird.good.CompositeMachine();
		System.out.println("=========GOOD========");

		good.print(doc);
		good.send(doc);

	    org.sundaybird.withdefault.CompositeMachine withDefault = new org.sundaybird.withdefault.CompositeMachine();
		System.out.println("=====WITH DEFAULT====");
		withDefault.print(doc);
		withDefault.send(doc);


		List<String> strnigList = new ArrayList<>();

    }
}
