package tddBasedStack;

public class StackDev {
	private static final int STACK_SIZE = 3;
	private int[] stackArray;
	private int size;
	private int top;
	public StackDev() {
		stackArray = new int[STACK_SIZE];
		size = 0;
		top=-1;
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull() {
		if(size==stackArray.length)
			return true;
		return false;
	}
	public int push(int data) {
		if(!isFull()) {
			stackArray[size] = data;
			size++;
			top+=1;
			return data;
		}
		return -1;	
	}
	public int peek() {
		int picked;
		if(!isEmpty()) {
			picked = stackArray[top];
			return picked;
		}
		return -1;
	}
	public int pop() {
		int popped;
		if(!isEmpty()) {
			popped = stackArray[top];
			stackArray[top]= 0;
			top--;
			size--;
			return popped;
		}
		return -1;
	}
}
