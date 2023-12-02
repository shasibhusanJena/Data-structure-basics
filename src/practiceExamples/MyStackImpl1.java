package practiceExamples;

/**
 * push: A new entity added to the top of the collection.
 * pop: A entity will be removed from the top of the collection
 * peek or top: Returns top of the entity without removing it.
 * OverFlow State: If a Stack is full and does not contain enough space
 * Underflow State: the pop operation remove the element from top of the stack
 * 
 * Add or removal id vary fat and and done with O(1) time.
 * 
 * @author shjena
 *
 */
public class MyStackImpl1 {

	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public MyStackImpl1(int size) {
		this.stackSize =size;
		this.stackArr = new int[stackSize];
		this.top = -1;
	}
	public boolean isStackFull() {
		return (top == stackSize-1);
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	public void push(int entry) throws Exception{
		// before push check of stack if full
		if(isStackFull()) {
			throw new Exception("Stack is already full cannot add new elements");
		}
		
		this.stackArr[++top] =entry;
		System.out.println("Added: "+entry);
	}
	
	public int pop() throws Exception{
		// Before pop check if stack is empty, if empty then send the msg. 
		if(isStackEmpty()) {
			throw new Exception("Stack is empty , cannnot remove element");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed Entry"+entry);
		return entry;
	}
	public static void main(String[] args) {
        MyStackImpl1 stack = new MyStackImpl1(5);
        try {
            stack.push(4);
            stack.push(8);
            stack.push(3);
            stack.push(89);
            stack.pop();
            stack.push(34);
            stack.push(45);
            stack.push(78);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
}
