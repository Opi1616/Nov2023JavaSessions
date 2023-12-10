package ArrayListConcept;

import java.util.ArrayList;

public class ListDyanamicArray {

	public static void main(String[] args) {

		// ArrayList -- default class
		// create the object of arrayList

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());

		ar.add(100);// 0
		ar.add(200);// 1

		System.out.println(ar.size());
		ar.add(300);// 2
		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		// System.out.println(ar.get(5));//IndexOutOfBoundsException
		// System.out.println(ar.get(-1));//IndexOutOfBoundsException

		ar.add(600);// 5
		System.out.println(ar.get(5));

		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		System.out.println(ar.size());

		// Generics in arraylist
		ArrayList<Integer> markList = new ArrayList<Integer>();// virtual capacity=10, physical capacity=0
		markList.add(100);// 0
		markList.add(200);// 1
		System.out.println(markList.size());

		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.33);
		bmiList.add(100.00);

		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("safari");
		browserList.add("opera");

		System.out.println(browserList.size());

		System.out.println(browserList.get(1));

		System.out.println(browserList);

		System.out.println("===========");

		for (int i = 0; i < browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if (browserList.get(i).equals("firefox")) {
				System.out.println("mozila");
				break;
			}
		}

		System.out.println("===========");
		for (String e : browserList) {
			System.out.println(e);
		}

		// emp info: name, age, salary, string, char,true
		ArrayList<Object> empInfoList = new ArrayList<Object>();
		empInfoList.add("Riya");
		empInfoList.add("Sinha");
		empInfoList.add(30);
		empInfoList.add(45.55);
		empInfoList.add("Banglore");
		empInfoList.add('f');
		empInfoList.add(true);

		System.out.println(empInfoList.size());

		System.out.println("===========");
		for (Object e : empInfoList) {
			System.out.println(e);
		}
		System.out.println(empInfoList);
		System.out.println("===========");

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(3000);
		numbers.add(100);

		System.out.println(numbers);
		System.out.println("===========");
		for (Integer e : numbers) {
			System.out.println(e);
			if (e == 200) {
				System.out.println("==200==");
				break;
			}
			System.out.println("===========");
			
			//LF- load factor--> pc/2 -->size()/2
			//vc =10, pc=0
			//pc=10, vc=0, lastindex=8-9
			//LF= pc/2-->10/2=5
			//pc=15,vc=0, 0-14
			//LF=pc/2 -->15/2-->7
			
			//use cases: 
			//uber:  carList
			//amazon: productList
			//userList
			//total links --> linksList
			//total imaes --> imagesList
			
			
		}

	}
}
