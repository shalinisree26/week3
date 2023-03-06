package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("shalini");
	}
	public void studentDept() {
		System.out.println("ece");
	}
	public void studentId() {
		System.out.println("123");
	}

	public static void main(String[] args) {
		Student details=new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.deptNmae();
		details.studentName();
		details.studentDept();
		details.studentId();

	}

}
