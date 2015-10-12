package com.qiu.liming.Resume;

public class Resume implements Cloneable{

	private int age;
	
	private String name;
	
	private String sex;
	
	private WorkExp we;

	public Resume() {
		we = new WorkExp();
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public WorkExp getWe() {
		return we;
	}

	public void setWe(String workdate, String compName) {
		we.setConpanyName(compName);
		we.setWorkDate(workdate);
	}
	
	public Resume clone() {  
		Resume o = null;  
        try {  
            o = (Resume) super.clone();  
        } catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return o;  
    }  
	
}
