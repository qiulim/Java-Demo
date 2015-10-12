package com.qiu.liming.Resume;

public class WorkExp {

	private String workDate;
	
	private String conpanyName;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getConpanyName() {
		return conpanyName;
	}

	public void setConpanyName(String conpanyName) {
		this.conpanyName = conpanyName;
	}

	@Override
	public String toString() {
		return "WorkExp [workDate=" + workDate + ", conpanyName=" + conpanyName + "]";
	}
	
	

}
