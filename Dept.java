package com.google.erp;

//------------------------------------------
// 부서 정보를 관리하는 [Dept] 클래스 선언
//------------------------------------------
public class Dept {
	//------------------------------------------
	// 속성변수 선언하기
	//------------------------------------------
	private int dept_no;			// 속성변수가 없으면 속성변수를 거론한 곳에서 다 에러 발생
	
	private String dept_name;
	
	private String loc;
	//------------------------------------------
	// 생성자 선언하기
	//------------------------------------------
	
	public Dept(int dept_no, String dept_name, String loc) {
		this.dept_no = dept_no;		// 에러
		this.dept_name = dept_name;
		this.loc = loc;
	}
	//------------------------------------------
	// 메소드
	//------------------------------------------
	// source - generate getter/setter
	
	public int getDept_no() {
		return dept_no;				// 에러
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;		// 에러
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
	/*
	//부서 번호를 리턴하는 메소드 선언	
	//------------------------------------------
	public int getDept_no() {
		return dept_no;				// return this.dept_no; 도 가능하다. 
	}
	//------------------------------------------
	// 부서명을 리턴하는 메소드 선언
	//------------------------------------------
	public String getDept_name() {
		return dept_name;
	}
	//------------------------------------------
	// 주소를 리턴하는 메소드 선언
	//------------------------------------------
	public String getLoc() {
		return loc;
	}
	//------------------------------------------
	// 부서 번호를 수정하는 메소드 선언
	//------------------------------------------	
	public void setDept_no(int dept_no) {		// void : 리턴형이 없을 때 쓰는 리턴자료형
		this.dept_no = dept_no;
	}
	//------------------------------------------
	// 부서 이름를 수정하는 메소드 선언
	//------------------------------------------	
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	//------------------------------------------
	// 주소를 수정하는 메소드 선언
	//------------------------------------------
	public void setLoc(String loc) {
		this.loc = loc;
	}
*/