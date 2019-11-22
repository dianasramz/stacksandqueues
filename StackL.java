
public class StackL<T> {
	private Node<T> top;
	private int size;
	
    /* Constructors ****************************************************************
        TODO 1
        o	One default constructor
        o	One constructor that take a node and starts the stack with this node in it
     */
    public StackL(){

	}

    public StackL(Node N){
		top = N;
		size = 0;
	}

    // Getters *********************************************************************
	/**
     * TODO 2
     * getSize
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

    // Other methods ***************************************************************
	/* 	o	TODO 3: Push: takes data T (see Person.java) and adds it to the stack 
	 *	o	TODO 4: Pop: void method that removes the top element of the stack, if the stack is not empty
	 *	o	TODO 5: Peek: returns the top element of the stack (without removing it)
	 *	o	TODO 6: Clear: empties the stack
	 *	o	TODO 7: isEmpty: returns true if the stack is empty, false otherwise
	 */
	public void push(T data) {
		// Your code goes here
		Node <T> top = new Node<>(data);
		top.setNext(this.top);
		this.top = top;
		size++;
	}
	
	public void pop() {
		// Your code goes here
		top = top.getNext();
		size--;
	}
	
	public T peek() {
		// Your code goes here
		return top.getData();
	}
	
	public void clear() {
		// Your code goes here
		while(!isEmpty()){
			pop();
		}
	}
	
	public boolean isEmpty() {
		// Your code goes here
		return top == null;
	}
	
}
