package com.qiu.liming.thinkinginjava.demo;

import com.qiu.liming.thinkinginjava.demo.exception.OutofBoundException;

public class Sequence {

	private Object[] items;
	private int next = 0;

	//¹¹Ô?¯Ê?¬³õÊ¼»¯Ê?éitemsµÄ´óĞ¡¡£
	public Sequence(int size) {
		items = new Object[size];
	}

	//ÏòÊ?éitemsÄÚÌúØÓ¶ÔÏó¡£
	public void add(Object x) throws OutofBoundException {
		if (next < items.length) {
			items[next++] = x;
		} else {
			throw new OutofBoundException();
		}
	}

	//ÄÚÁªÀà£¬ÓÃÓÚ±éÀúÊ?éitems
	private class SequenceSelector implements ISelector {

		private int i = 0;

		@Override
		public boolean end() {

			return i == items.length;
		}

		@Override
		public Object current() {

			return items[i];
		}

		@Override
		public void next() {

			if (i < items.length) {
				i++;
			}

		}
		

	}

	//·µ»Ø±éÀúÆ?
	public ISelector getSelector() {
		return new SequenceSelector();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence s =  new Sequence(10);
		for(int i=0; i<10; i++) {
			try {
				s.add(Integer.toString(i));
			} catch (OutofBoundException e) {
				System.out.println("outofboundexception occured");
			}
		}
		
		ISelector iSel = s.getSelector();
		
		while(!iSel.end()) {
			System.out.println(iSel.current());
			iSel.next();
		}
	}

}
