package mains;

import beans.StudentBean;
import beans.TeacherBean;

public class ForStudentBeanMain {

	public static void main(String[] args) {
		StudentBean bean = new StudentBean();
		System.out.println("Student Name : "+bean.getStudentName());
		System.out.println("Student Id : "+bean.getStudentId());
		TeacherBean teacherBean = new TeacherBean();
	}

}
