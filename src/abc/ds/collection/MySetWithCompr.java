package abc.ds.collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * to implement your own string functionality with TreeSer pass comparator object along with treeSet.
 */

public class MySetWithCompr {
public static void main(String[] args) {
	
	TreeSet<String> ts = new TreeSet<>();
	ts.add("RED");
	ts.add("ORANGE");
	ts.add("BLUE");
	ts.add("GREEN");
	
	System.out.println(ts);
}

class Mycomparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}
}
