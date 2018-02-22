package prob5;

public class MyStack {
	private String[] buffer;
	private int top;
	
	public MyStack() {
		buffer = new String[3];
		top = -1;
	}
	
	public MyStack(int size) {
		buffer = new String[size];
		top = -1;
	}
	
	public void push(String item) {
		if (top >= buffer.length - 1) {
			int resize = buffer.length * 2;
			String[] temp = new String[resize];
			
			for (int i = 0; i < buffer.length; i++) {
				temp[i] = buffer[i];
			}
			buffer = temp;
			temp = null;
			buffer[++top] = item;
		}
		buffer[++top] = item;
	}
	
	public String pop() throws MyStackException {
		if (top==-1) {
			throw new MyStackException();
		}
		return buffer[top--];
	}
	
	public boolean isEmpty() {
		if (top==-1) return true;
		return false;
	}
	
}