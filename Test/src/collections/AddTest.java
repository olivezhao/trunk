package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AddTest {
	public static void main(String[] args){
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Iterator<Integer> it = collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void getSth(){
		
	}
}
