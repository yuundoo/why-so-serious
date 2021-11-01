package com.yedam.java.ch01;

public class StringStack implements Stack {
	private int num; //개수
	private int set; //위치
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
		//set 이 가질수 있는 최대 값 : num
		//set 이 가질수 있는 최소 값 : -1
		if(set-1<0)
		return null;
		set--;
		String s = stack[set];
		return s;

		
		
	}

	@Override
	public boolean push(String val) {
		if(set<num) {
			stack[set++] = val;
			return true;
		}
		else
		return false;
	}

}
