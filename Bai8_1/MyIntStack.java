package Bai8_1;

public class MyIntStack {
	   private int[] contents;
	   private int tos;  
	   
	   public MyIntStack(int capacity) {
	      contents = new int[capacity];
	      tos = -1;
	   }
	 
	   public boolean push(int element) {
	      if (isFull()) {
	         int[] newContents = new int[contents.length * 2];
	         System.arraycopy(contents, 0, newContents, 0, contents.length);
	         contents = newContents;
	      }
	      contents[++tos] = element;
	      return true;
	   }
	 
	   public int pop() {
	      if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	      }
	      return contents[tos--];
	   }
	 
	   public int peek() {
	      if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	      }
	      return contents[tos];
	   }
	 
	   public boolean isEmpty() {
	      return tos < 0;
	   }
	 
	   public boolean isFull() {
	      return tos == contents.length - 1;
	   }
	}

