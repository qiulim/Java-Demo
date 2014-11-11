package com.hp.liming.test;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringTest {

	
	
	 static final int VIEW_STATE_WINDOW_FOCUSED = 1;
	    static final int VIEW_STATE_SELECTED = 1 << 1;
	    static final int VIEW_STATE_FOCUSED = 1 << 2;
	    static final int VIEW_STATE_ENABLED = 1 << 3;
	    static final int VIEW_STATE_PRESSED = 1 << 4;
	    static final int VIEW_STATE_ACTIVATED = 1 << 5;
	    static final int VIEW_STATE_ACCELERATED = 1 << 6;
	    static final int VIEW_STATE_HOVERED = 1 << 7;
	    static final int VIEW_STATE_DRAG_CAN_ACCEPT = 1 << 8;
	    static final int VIEW_STATE_DRAG_HOVERED = 1 << 9;
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "  4    down  180.8.187.53                              yes     5            -";
		str = str + "\n   4    up  180.8.187.53                              yes     5            -";
		boolean result = getUnoTBackupState(str,"up");
//		System.out.println(result);
		
//		System.out.println(System.getProperty("line.separator"));
//		
//		System.out.println(VIEW_STATE_WINDOW_FOCUSED );
//		System.out.println(VIEW_STATE_SELECTED );
//		System.out.println(VIEW_STATE_FOCUSED );
//		System.out.println(VIEW_STATE_ENABLED );
//		System.out.println(VIEW_STATE_PRESSED );
//		System.out.println(VIEW_STATE_ACTIVATED );
//		System.out.println(VIEW_STATE_ACCELERATED );
//		System.out.println(VIEW_STATE_HOVERED );
//		System.out.println(VIEW_STATE_DRAG_CAN_ACCEPT );
//		System.out.println(VIEW_STATE_DRAG_HOVERED );
//
//	   System.out.println(2<<2);
		String[] strs = new String[]{"1","2","3"};
		List list = Arrays.asList(strs);
		System.out.println(list.size());
	    
	}
	
	public static boolean getUnoTBackupState(String resultString,String judetStr) {
		StringTokenizer stLine = new StringTokenizer(resultString, " ");
		while (stLine.hasMoreTokens()) {
			String str = stLine.nextToken().trim();
			if (judetStr.equals(str)) {
				return true;
			}
		}
		return false;
	}

}
