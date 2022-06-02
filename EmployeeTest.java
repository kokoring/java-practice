package com.google.erp;

public class EmployeeTest {
	
	// 속성변수 선언
	
	// [직원번호] 저장되는 int형 속성변수 [emp_no] 선언
	// [직원이름] 저장되는 String형 속성변수 [emp_name] 선언
	// [직급] 저장되는 String형 속성변수 [jikup] 선언
	// [연봉] 저장되는 double형 속성변수 [salary] 선언
	
	// 속성변수는 주로 private
	
	// 속성변수 형식 선언 써보기
	// public|protected|default|private [static] [final] 기본자료형|클래스명|인퍼테이스명 속성변수명[=데이터];
	
	private int emp_no;
	
	private String emp_name;
	
	private String jikup;
	
	private double salary;
	
	// 생성자 선언
	
	// 생성자는 객체화 될 때 딱 한번 호출됨
	// 메소드는 반복적으로 호출 가능
	// 생성자는 코딩상 0개, 존재상 1개
	// 개발자가 코딩 하지 않았으면 java에서 자동으로 기본형 생성해줌
	// 기본형 : public EmployeeTest(){};
	
	// 생성자 형식 선언 써보기
	// public|protected|default|private 생성자명 ([자료형 매개변수명,~]){ 실행구문 ;}
	
	// 속성변수에 생성자의 매개변수로 들어오는 데이터 저장
	// this.속성변수 = 매개변수
	
	public EmployeeTest(int emp_no, String emp_name, String jikup, double salary ) {
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.jikup = jikup;
		this.salary = salary;
	}
	// 메소드 선언
	
	
	// [직원번호] 리턴하는 메소드 선언
	public int getEmp_no() {
		return emp_no;
	}	
	// [직원이름], [직급], [연봉] 리턴하는 메소드 선언
	public String getEmp_name() {
		return emp_name;
	}
	public String getJikup() {
		return jikup;
	}
	public double getSalary() {
		return salary;
	}
	
	// 직원이름, 번호, 직급, 연봉을 수정해야 하는 상황이 있을 수도 있는데
	// 수정하는 메소드 선언
	
	// 수정할 때는 리턴값이 없다
	// 리턴값이 없을 때는? void
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
		
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public void setJikup(String jikup) {
		this.jikup = jikup;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// 메소드 선언 형식 써보기
	// public|protected|default|private [static] [final|abstract] 기본자료형|클래스명|인터페이스명|void 메소드명([자료형 매개변수, ~]){실행구문;}
	
	

}
