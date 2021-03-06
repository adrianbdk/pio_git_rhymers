package edu.kis.vh.nursery.list;

public class IntLinkedList {

	Node last;
	int i;
	public static final int VAL = -1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return VAL;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return VAL;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
