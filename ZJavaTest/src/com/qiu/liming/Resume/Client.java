package com.qiu.liming.Resume;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Resume resume = new Resume();
		resume.setAge(20);
		resume.setName("张三");
		resume.setSex("男");
		resume.setWe("2014-3-2","companyFirst");
		
		Resume resume2 = resume.clone();
		resume2.setAge(21);
		resume2.setName("李四");
		resume2.setSex("男");
		resume2.setWe("2015-4-3","companySecond");
		
		System.out.println(resume2.getName() + resume2.getSex() + resume2.getAge() + resume2.getWe().toString());
		System.out.println(resume.getName() + resume.getSex() + resume.getAge() + resume.getWe().toString());
	
	}

}
