package day15_Java_Collection;

import java.util.*;

/*1) Heterogeneous data - allowed
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed */

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<>();
		numberList.add(11);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		System.out.println(numberList);
		Collections.sort(numberList);
		System.out.println(numberList);
		System.out.println(Collections.max(numberList));
		System.out.println("----------------------------");


		//declaration
		ArrayList mylist1=new ArrayList(); //It will store Heterogeneous data
		//ArrayList <String>mylist=new ArrayList<String>();  // only strings
		//List mylist1=new ArrayList(); //mylist1 is object of ArrayList class refer to List interface


		//adding data elements into arraylist
		mylist1.add(100);
		mylist1.add(10.5);
		mylist1.add("welcome");
		mylist1.add(true);
		mylist1.add(100);
		mylist1.add(null);
		mylist1.add(null);

		//size of arraylist
		int myListSize = mylist1.size();
		System.out.println(mylist1.size());//7

		System.out.println(mylist1);  //[100, 10.5, welcome, true, 100, null, null]

		//remove value from arraylist
		mylist1.remove(3);
		System.out.println("After removing element:"+mylist1);  //[100, 10.5, welcome, 100, null, null]

		//inserting new element in the middle of the list
		mylist1.add(2,"java");

		System.out.println("after insertion:"+mylist1);  //[100, 10.5, java, welcome, 100, null, null]

		System.out.println(mylist1.get(3));

		//read all the data from arraylist

		for(int j=0;j<myListSize;j++) {
			try {
				System.out.println(mylist1.get(j));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		/*for(Object x:mylist1)
		{
			System.out.println(x);
		}*/

		mylist1.clear(); //clears the data from arraylist
		System.out.println("After clearing "+ mylist1);  // []



	}

}
