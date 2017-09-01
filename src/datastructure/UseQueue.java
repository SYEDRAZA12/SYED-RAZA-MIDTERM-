package datastructure;

import javax.lang.model.element.Element;
import java.util.*;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> queue = new LinkedList<>();

		queue.add("Infant");
		queue.add("Toddler");
		queue.offer("Teenager");
		queue.offer("Adult");

			Iterator it =  queue.iterator();
			while (it.hasNext()){
				System.out.println(it.next());
			}

			System.out.println();

			System.out.println(queue.peek());

			System.out.println(queue.poll());

			System.out.println(queue.peek());

		queue.remove("Toddler");
		System.out.println();

		for(String q: queue){
			System.out.println(q);
		}

		System.out.println();

		Iterator ita = queue.iterator();
		while (ita.hasNext()){
			System.out.println(ita.next());
		}

	}

}
