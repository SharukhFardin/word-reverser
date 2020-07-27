package ds.stack;

public class StackString {
	private int maxSize;
	private char[] stackArr;
	private int top;
	
	public StackString(int size) {
		this.maxSize= size;
		this.stackArr = new char[maxSize];
		this.top = -1;	
	}
	
	public void push(char j){
		if(isFull()) {
			System.out.println("The Stack is Full");
		}else {
			top++;
			stackArr[top] = j;	
		}
	}
	
	public char pop(){
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '0';
		}else {
			int old_top = top;
			top--;
			return stackArr[old_top];
		}
	}
	
	public char peak() {
		return stackArr[top];
	}
	
	public boolean isEmpty(){
		return(top==-1);		
	}
	
	public boolean isFull() {
		return(maxSize-1==top);
	}
}
