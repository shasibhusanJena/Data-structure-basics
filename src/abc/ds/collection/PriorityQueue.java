package abc.ds.collection;

class Student1 implements Comparable<Student1>{
	
	private int rank;
	private String name;
	
	public Student1(int rank, String name) {
			super();
			this.rank = rank;
			this.name = name;
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub	
		if (rank < o.rank) {
			return -1;
		}
		else if (rank < o.rank) {
			return 1;
		}
		return 0;
	}
	@Override
	public String toString() {
			String result = "Student Name " +name+ ", Rank"+ rank;
			return result;
	}
}
public class PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Student1> q1 = new PriorityQueue<>();
}
}


