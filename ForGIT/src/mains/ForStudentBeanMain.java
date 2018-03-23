package mains;

import beans.StudentBean;

public class ForStudentBeanMain {

	public static void main(String[] args) {
		StudentBean bean = new StudentBean();
		System.out.println("Student Name : "+bean.getStudentName());
	}

}
