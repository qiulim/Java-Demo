package com.hp.liming.designPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pictures extends Graphics {

	private List<Graphics> gra = new ArrayList<Graphics>();
	
	@Override
	protected void draw() {
		Iterator<Graphics> it = gra.iterator();
		while(it.hasNext()) {
			Graphics tmp=(Graphics)it.next();
			tmp.draw();
		}
	}

	private void add(Graphics g) {
		gra.add(g);
	}
	
	private void remove(Graphics g) {
		gra.remove(g);
		
	}
	
	private Graphics getChild(int i) {
		
		return gra.get(i);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pictures p = new Pictures();
		
		Line l = new Line();
		Circle c = new Circle();
		p.add(l);
		p.add(c);
		p.draw();
	}

}
