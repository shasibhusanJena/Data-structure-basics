
package oops;

public class constOverloadEmp {

	public constOverloadEmp() {
		System.out.println("inside defalut constructor");
	}
	void constOverloadEmp(int x) {
		System.out.println("inside parametrized constructor .."+x);
	}
	void constOverloadEmp(String str) {
		System.out.println("inside parametrized constructor .."+str);
	}

}
