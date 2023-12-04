package abc.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * input : Student[] arr type
 * sort a arrayList using comparator interface
 * 
 */
class Shop{
	int productNo,stock;
	String name;
	
	public Shop(int productNo, int stock, String name) {
		super();
		this.productNo = productNo;
		this.stock = stock;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shop [productNo=" + productNo + ", stock=" + stock + ", name=" + name + "]";
	}
	
}
class SortByStock implements Comparator<Shop>{

	@Override
	public int compare(Shop o1, Shop o2) {
		
		if(o1.stock == o2.stock) {
			return 0;
		}
		else if (o1.stock > o2.stock) {
			return 1;
		}
		else
			return -1;
	}
	
}
class SortByName implements Comparator<Shop>{

	@Override
	public int compare(Shop o1, Shop o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class ArrayListSortingUsingComparator {
	public static void main(String[] args) {
	
	List<Shop> list = new ArrayList<Shop>();
	list.add(new Shop(12, 40, "english"));
	list.add(new Shop(32, 23, "Hindi"));
	list.add(new Shop(45, 56, "Science"));
	list.add(new Shop(11, 211, "Physics"));
	
	Collections.sort(list, new SortByStock());
	
	System.out.println("sorting on stock value"+list);
	
	}
	
}


