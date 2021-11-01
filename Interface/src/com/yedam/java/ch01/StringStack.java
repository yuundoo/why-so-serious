package com.yedam.java.ch01;

public class StringStack implements Stack {
	private int num;
	private int set;
	private String[]stack;
	public StringStack(int num) {
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}
	@Override
	public int length() {
		return set;
	}

	@Override
	public int capacity() {
		return stack.length;
	}

	@Override
	public String pop() {
		if(set-1<0)
		return null;
		set--;
		String s = stack[set];
		return s;

		
		
	}

	@Override
	public boolean push(String val) {
		if(set<num) {
			stack[set] = val;
			set++;
			return true;
		}
		else
		return false;
	}

}
