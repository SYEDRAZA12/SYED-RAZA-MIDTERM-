package datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<Object> arrayList= new ArrayList<>();

		arrayList.add("Arfeen");
		arrayList.add("Aroosh");
		arrayList.add("Iram");
		arrayList.add("Sammar");
		arrayList.add("Unwanted");
		arrayList.add("Unwanted");

		arrayList.remove("Unwanted");
		arrayList.remove(arrayList.size()-1);

		for (Object st: arrayList){
			System.out.println(arrayList.indexOf(st)+"  "+st);
		}
			System.out.println();
			int count = 0;
			Iterator it = arrayList.iterator();
		while (it.hasNext()){
			System.out.println(count+"  "+it.next());
			count++;
		}

		ConnectDB connectDB = new ConnectDB();


		//create the table in pnt called 'tableName'
		//ex:create table Pizza(Ingredients VARCHAR(20));

		connectDB.InsertDataFromArrayListToMySql(arrayList,"Family","Names");
		connectDB.readDataBase("Family","Names");



	}

}
