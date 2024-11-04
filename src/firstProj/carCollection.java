package firstProj;

import java.util.ArrayList;
import java.util.Iterator;

public class carCollection {
	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<String>();
		
		cars.add("audi");
		cars.add("jaguar");
		cars.add("aston martin");
		cars.add("ferrari");
		cars.add("ford");
		cars.add("mercedes");
		cars.add("porsche");
		cars.add("tesla");
		cars.add("suzuki");
		cars.add("acura");
		displayNames(cars);
		Iterator<String>itr=cars.iterator();
		System.out.println("Names of car without starting with letter a");
		while(itr.hasNext()) {
			String name = itr.next();
            char firstLetter = name.charAt(0);
            if (firstLetter == 'a') {
                itr.remove(); // Safely remove element while iterating
            }
		}
		displayNames(cars);
		
	}
	public static void displayNames(ArrayList cars) {
		
		Iterator<String> itr=cars.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();	
			System.out.println(name);
		}
		

	}

}
