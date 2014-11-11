package com.hp.liming.thinkinginjava.demo;

import com.hp.liming.thinkinginjava.demo.exception.OutofBoundException;

public class Sequence {

	private Object[] items;
	private int next = 0;

	//构造函数，初始化数组items的大小。
	public Sequence(int size) {
		items = new Object[size];
	}

	//向数组items内添加对象。
	public void add(Object x) throws OutofBoundException {
		if (next < items.length) {
			items[next++] = x;
		} else {
			throw new OutofBoundException();
		}
	}

	//内联类，用于遍历数组items
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

	//返回遍历器
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
