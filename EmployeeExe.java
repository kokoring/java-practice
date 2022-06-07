package com.google.erp;


//-------------------------------------
// Employee 클래스를 객체화하고 메소드를 호출할 목적의[EmployeeExe] 클래스 선언하기
//-------------------------------------
public class EmployeeExe {
	//-------------------------------------	
	// JVM이 가장 먼저 찾아서 자동으로 호출하는 메소드
	//-------------------------------------	
	public static void main(String[] args) {
		//-------------------------------------
		// Employee 객체를 생성하고 객체의 메위주를 얻어 employee 변수에 저장하기
		//-------------------------------------
		// Employee : 참조형(클래스명) , employee : 변수  	
		// Employee employee; Employee 클래스를 객체화 했을 때의 메모리 위치 주소값이 들어갈 것이다.
		// new Employee에서 Employee는 생성자명
		//-------------------------------------
		// 1. Employee 객체의 메위주를 저장할 변수 employee 선언하기
		// 2. 수입한 클래스 중에 new 오른쪽 생성자 호출이 가능한 생성자를 가진 클래스를 찾아 복사해서 메모리에 올려 객체화하기 (아래 주석 참조)
		// 3. 객체의 생성자를 new 오른쪽 Employee(~)로 호출하기
		// 4. 객체의 메모리 위치 주소값 리턴하기
		// 5. 리턴한 객체의 메모리 위치 주소값을 employee에 저장하기	
		//-------------------------------------		
			// 1은 Employee employee 의 해설
			// 2~4은 new Employee( 1, "사오정" ); 의 해설
			// 5는 = 의 해설
		//-------------------------------------	
		Employee employee = new Employee( 1, "사오정" );;	// Employee( 1, "사오정")이 호출 코딩
		// 클래스명 변수 = new 생성자명(객체의 속성변수에 넣을 데이터값들)
		// new : 생성자 소유한 클래스 객체화, 갱성자호출, 메위주 리턴
		// employee : 객체참조변수

		
	/*
		  public Employee( int emp_no, String emp_name) {	// 매개변수명과 속성변수명이 동일할 수 있음
		 
			//----------------------------------		
			// 속성변수에 생성자의 매개변수로 들어온 데이터 저장하기
			//----------------------------------
			this.emp_no = emp_no;
			this.emp_name = emp_name;	// this. 뒤에 나오는 것이 속성변수
		}
	*/
		
		//-------------------------
		// Employee 객체의 메소드를 호출하여 원하는 작업 하기
		//-----------------------------
		// Employee 객체의 메소드 호출로 얻은 데이터 출력하기
		//------------------------------
		
		System.out.println(" 직원번호 => "+ employee.getEmp_no() );
		
		System.out.println(" 직원이름 => " + employee.getEmp_name() );	
		System.out.println("-----------------------------");
		
		// System.out.println(" 직원이름 => " + employee.emp_name() ); 는 에러 발생
		// private String emp_name;에 private이 붙어 있으니 객체화 성공 했어도 호출 불가능함. (invisible)
		// 내부의 동료만 호출이 가능하다.
		
		// 속성변수도 private이고 매개변수도 private일 수는 없다.
		// 지금 속성변수는 private, 매개변수는 public
		
		//-----------------------------------
		// Employee 객체의 메소드 호출로 객체의 데이터 수정하기
		//-----------------------------------
		employee.setEmp_name("저팔계");
		employee.setEmp_no(2);
		//-----------------------------------
		// Employee 객체의 메소드 호출로 얻은 데이터 출력하기
		//-----------------------------------
		System.out.println(" 직원번호 => "+ employee.getEmp_no() );
		
		System.out.println(" 직원이름 => " + employee.getEmp_name() );			
		
		
		
		
		
	}

}
