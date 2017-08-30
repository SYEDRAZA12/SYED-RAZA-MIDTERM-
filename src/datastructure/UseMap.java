package datastructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> myMmap = new HashMap<>();

				myMmap.put(0, "Canada");
				myMmap.put(2, "USA");
				myMmap.put(9, "UK");
				myMmap.put(3, "UAE");
				myMmap.put(12, "UAE");
				myMmap.put(7, "UN-WANTED");

		for(Map.Entry<Integer, String> m : myMmap.entrySet()){
				System.out.println(m);
		}

				System.out.println();

				myMmap.remove(7);


				myMmap.replace(9, "UK", "UNITED KINGDOM");

				System.out.println();



		for(Map.Entry<Integer, String> m : myMmap.entrySet()){
			System.out.println(m);
		}
				System.out.println("UK is updated as United Kingdom and Un Wanted Country is deleted ");

		myMmap.put(14,"PAKISTAN");

		System.out.println();

		Iterator<Map.Entry<Integer, String>> m = myMmap.entrySet().iterator();
		while(m.hasNext()){
			System.out.println(m.next());


		}
			System.out.println();
			System.out.println("New Country Pakistan Added");



	}


}
