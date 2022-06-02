package com.google.erp;

// EmployeeTest 클래스 객체화 하고 메소드 호출할 목적의 [EmployeeTestExe] 클래스 선언

public class EmployeeTestExe {
	
	// main method
	// JVM이 가장 먼저 찾고 자동으로 호출 
	public static void main(String[] args) {
		
		// EmployeeTest 라는 객체를 생성
		// 객체의 메모리 위치 주소값을 얻어서
		// employeetest 변수에 저장하자
		
		// EmployeeTest : 클래스명,참조형
		// employeetest : 변수
		
		// EmployeeTest employeetest ; EmployeeTest라는 클래스를 객체화 했을 때 
		// 메모리 위치 주소값이 employeetest라는 변수에 들어갈 것이다. 
		
		// new EmployeeTest에서 EmployeeTest는 생성자명
		
		// 풀어보자..
		// 1. EmployeeTest 객체의 메모리위치 주소값을 저장할 변수 employeetest 선언
		// 2. 수입한 클래스 중에 new 오른쪽 생성자 호출이 가능한 생성자를 가진 클래스를 찾아
		// 		복사해서 메모리에 올려서 객체화 하기
		// 3. 객체의 생성자를 new 오른쪽의 EmployeeTest(~)로 호출하기
		// 4. 객체의 메모리 위치 주소값 리턴하기.
		// 5. 리턴한 객체의 메모리 위치 주소값 employeetest에 저장하기
		
		EmployeeTest employeetest = new EmployeeTest(1, "김성준","부장",6000.0);
		
		// 클래스명 변수 = new 생성자명 (객체의 속성변수에 넣을 데이터값들)
		
		// new : 생성자를 소유한 클래스를 객체화 시키는 것. 생성자를 호출하고 메모리위치주소값을 리턴함
		// 이 때 변수를 객체참조변수라고 함
			
		// EmployeeTest 객체의 메소드 호출해보기
		// 호출 해서 데이터 출력
		
		System.out.println(" 직원번호 : " + employeetest.getEmp_no());
		System.out.println(" 직원이름 : " + employeetest.getEmp_name());
		System.out.println(" 직급 : " + employeetest.getJikup());
		System.out.println(" 연봉 : " + employeetest.getSalary());
		
		System.out.println("----------------------------");
		
		// 데이터 수정이 필요할 때도 있으니까
		
		employeetest.setEmp_name("윤동준");
		employeetest.setEmp_no(10);
		employeetest.setJikup("차장");
		employeetest.setSalary(0.0);
		
		// 수정 메소드로 데이터 수정했으니까 출력해보기
		
		System.out.println(" 직원이름 : " + employeetest.getEmp_name());
		System.out.println(" 직급 : " + employeetest.getJikup());
		
		
		
		

	}

}
