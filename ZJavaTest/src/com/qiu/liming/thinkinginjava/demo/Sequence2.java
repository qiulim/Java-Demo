package com.qiu.liming.thinkinginjava.demo;

public class Sequence2 {
	
	private String[] items;
	private int next = 0;
	
	public Sequence2(int size) {
		items = new String[size];
	}
	
	public void add(int i) {
		items[next++] = Integer.toString(i);
		
	}
	
	private class reader {
		
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		
		public String toString() {
			return items[i];
		}
		
		public void next() {
			i++;
		}
	}
	
	public reader getReader() {
		return new reader();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence2 s = new Sequence2(10);
		for (int i = 0; i < 10; i++) {
			s.add(i);
		}
		
		reader r = s.getReader();
		while (!r.end()) {
			System.out.println(r.toString());
			r.next();
		}
	}

}
