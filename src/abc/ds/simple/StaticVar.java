package abc.ds.simple;

// Java program to demonstrate static variables
public class StaticVar {
	private static int count = 0;
	private int nonStaticCount = 0;

	public void incrementCounter()
	{
		count++;
		nonStaticCount++;
		System.out.println("***** count  "+count+" nonStaticCount "+nonStaticCount);
	}
	public static int getStaticCount()
	{
		return count;
	}
	public int getNonStaticCount()
	{
		return nonStaticCount;
	}
	public static void main(String args[])
	{
		StaticVar stVarObj1 = new StaticVar();
		StaticVar stVarObj2 = new StaticVar();
		StaticVar stVarObj3 = new StaticVar();
		StaticVar stVarObj4 = new StaticVar();

		stVarObj1.incrementCounter();
		stVarObj2.incrementCounter();
		stVarObj3.incrementCounter();
		stVarObj4.incrementCounter();
		stVarObj4.incrementCounter();
		stVarObj4.incrementCounter();
//		System.out.println("Static count for stVarObj1: " + stVarObj1.getStaticCount());
//		System.out.println("NonStatic count for stVarObj1: " + stVarObj1.getNonStaticCount());
//		System.out.println("Static count for stVarObj2: " + stVarObj2.getStaticCount());
//		System.out.println("NonStatic count for stVarObj2: " + stVarObj2.getNonStaticCount());	
		}
}
