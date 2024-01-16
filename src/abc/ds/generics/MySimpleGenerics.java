package abc.ds.generics;

public class MySimpleGenerics {

	public static void main(String[] args) {
		System.out.println("lets do Generic call");
		MySimpleGeneric<String>  sgs = new MySimpleGeneric<String>("Java2Novoice");
		sgs.printType();
		MySimpleGeneric<Boolean>  sgs1 = new MySimpleGeneric<Boolean>(Boolean.TRUE);
		sgs1.printType();
	}


}
/**
 * Public generic class for multiple use by different datastpe	
 */
class MySimpleGeneric<T>{
	
	private T objStuff = null;
	public MySimpleGeneric(T param) {
		this.objStuff = param;
	}
	public T getObjreff() {
		return this.objStuff;
	}
	
	public void printType() {
		System.out.println("Type:"+objStuff.getClass().getName());
	}
}
