package com.springcore;

public class Student {

	private int studentId;
	private String studentName;
	private String studentAddrees;
	public Student(int studentId, String studentName, String studentAddrees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddrees = studentAddrees;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentAddrees() {
		return studentAddrees;
	}
	public void setstudentAddrees(String studentAddrees) {
		this.studentAddrees = studentAddrees;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddrees=" + studentAddrees
				+ "]";
	}
	
}
