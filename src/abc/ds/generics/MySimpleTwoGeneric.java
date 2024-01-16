package abc.ds.generics;

public class MySimpleTwoGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lets do Generic call");
		SimpleGen<String,Integer>  sgs = new SimpleGen<String,Integer>("Java2Novoice",100);
		sgs.printTypes();
		SimpleGen<Boolean,Integer>  sgs1 = new SimpleGen<Boolean,Integer>(Boolean.TRUE,200);
		sgs1.printTypes();
	}
}
/**
 * Public generic class for multiple use by to generic attribute	
 */
class SimpleGen<U,V>{
	
	private U objUreff = null;
	private V objVreff =null;
	
	public SimpleGen(U objUreff, V objVreff) {
		this.objUreff = objUreff;
		this.objVreff = objVreff;
	}
	
	public void printTypes() {
		System.out.println("U Type: "+ objUreff.getClass().getName());
		System.out.println("V Type: "+ objVreff.getClass().getName());
	}
}