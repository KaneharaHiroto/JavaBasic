/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {

	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	public int getstudentId() {
		return this.studentId ;
	}
	public void setstudentId(int studentId){
		this.studentId=studentId;
	}

	public String getStudentName() {
		return this.studentName ;
	}
	public void setstudentName(String studentName){
		this.studentName=studentName;
	}

	public String getcompanyName() {
		return this.companyName ;
	}
	public void setcompanyName(String companyName){
		this.companyName=companyName;

	}public String getclassName() {
		return this.className ;
	}
	public void setclassName(String className){
		this.className=className;
	}

	public String getmail() {
		return this.mail ;
	}
	public void setmail(String mail){
		this.mail=mail;
	}

	public String getpassword() {
		return this.password ;
	}
	public void setpassword(String password){
		this.password=password;
	}
}
