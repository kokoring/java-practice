package com.google.erp;

// 직원 정보를 관리하는 [Employee] 클래스 선언하기

public class Employee {
	//---------------------
	// 속성변수 선언하기
	// 속성변수 : 공용으로 사용하는 데이터 저장하는 곳
	//---------------------
	// [직원번호]가 저장되는 
	// int형 속성변수 [emp_no]를 선언하기
	//---------------------
	
	// public|protected|default|private [static] [final] 기본자료형|클래스명|인터페이스명 속성변수명[=데이터];
	
	private int emp_no;
	
	//---------------------
	// [직원이름]이 저장되는 
	// String형 속성변수 [emp_name]를 선언하기
	//---------------------
	private String emp_name;	// 속성변수 앞에는 주로 private을 사용
		
	//---------------------
	// 생성자 선언하기
	//---------------------
	// 생성자는 객체화 될 때 단 한번 호출됨
	// 코딩상 0개, 존재상으로 1개
	
	//public|protected|default|private 생성자명(=클래스명) ([자료형 매개변수,~]){ 실행구문 ; }
	
	public Employee( int emp_no, String emp_name) {	// 매개변수명과 속성변수명이 동일할 수 있음
													// public을 private으로 바꾸면?
													// 호출할 수 없게 막아놓는 것
		//----------------------------------		
		// 속성변수에 생성자의 매개변수로 들어온 데이터 저장하기
		//----------------------------------
		this.emp_no = emp_no;
		this.emp_name = emp_name;	// this. 뒤에 나오는 것이 속성변수
	}
	
	//---------------------
	// 메소드 선언하기
	//---------------------
	// 관용적으로 속성변수는 private, 메소드는 public
	//---------------------
	// [직원번호]를 리턴하는 메소드 선언하기
	//---------------------
	
	//public|protected|default|private [static] [final|abstract] 기본자료형|클래스명|인터페이스명|void 메소드명([자료형 매개변수,~]){ 실행구문 ; }
	
	public int getEmp_no(){
		return emp_no;	// 속성변수 emp_no의 데이터를 리턴하기
						// 리턴 하고 싶은 자료가 없다면 void를 사용해야 함
						// void : 이 메소드를 호출해봤자 아무것도 리턴될 것 없음
	}
	//---------------------
	// [직원이름]을 리턴하는 메소드 선언하기
	//---------------------
		
	public String getEmp_name(){
		return emp_name;	// 속성변수 emp_name의 데이터를 리턴하기
	}
	
	//---------------------------
	// [직원이름]을 수정하는 메소드 선언하기
	//--------------------------------
	public void setEmp_name(String emp_name){	// 수정할 때는 리턴값이 필요 없음 >> void 사용
												// 원래는 리턴되는 데이터의 자료형을 써줘야 하는데 리턴값이 없으니까
		this.emp_name = emp_name;				// this.emp_name은 속성변수, emp_name은 매개변수
												// 갱신
	}	
	//------------------------------
	// [직원번호]을 수정하는 메소드 선언하기
	//--------------------------------												
	public void setEmp_no(int emp_no) {			// 리턴되는 데이터의 자료형을 써야 하는데 리턴값이 없으니까 void 사용
		this.emp_no = emp_no;					// this.emp_no는 속성변수, emp_no는 매개변수
	}
	
	
}


/*
---------------------------------------------
<문제> 생성자 public Employee(~){~} 를 주석 처리 한다면?
---------------------------------------------
	생성자는 코딩상 0개 이상이다.
	만약 0개면(즉, 아무것도 선언하지 않으면) 
	기본 생성자 public 생성자명(){}이 삽입된다.

	위 예제에서는 생성자가 0개면 public Employee(){}이 삽입된다.
---------------------------------------------
	Employee 클래스에서 에러는 없으나
	생성자 호출코딩을 받아드릴 수 있는 클래스를 찾을 수 없어서 
	com.google.erp.EmployeeExe 에서 
	Employee employee = new Employee( 1, "사오정" );;
	부분에서 에러가 발생한다. 
	
	생성자 호출코딩 Employee( 1, "사오정" )을 받아들이는 클래스가 없다. 

---------------------------------------------
<문제> 아래처럼 코딩을 수정하면?
---------------------------------------------
	public int getEmp_no(){
		return emp_no;
	}
---------------------------------------------
				▼
---------------------------------------------	
	public double getEmp_no(){
		return emp_no;
	}	
---------------------------------------------
	에러가 없다.
	
	return emp_no; 에서 emp_no 변수 안의 데이터를 리턴한다는 뜻.
	emp_no 변수 안의 데이터 자료형은 int형이다.
	메소드 왼쪽의 리턴 자료형과 실제 리턴 하는 데이터의 자료형이 맞지 않는다.
	실제 리턴 데이터 int가 double에 맞춰서 변화가 일어난다.
	결국 [직원번호]가 실수로 리턴 된다.

---------------------------------------------
<문제> 아래처럼 코딩을 수정하면?
---------------------------------------------
	public int getEmp_no(){
		return emp_no;
	}
---------------------------------------------
				▼
---------------------------------------------	
	public void getEmp_no(){
		return emp_no;
	}	
---------------------------------------------
	에러 발생. 
	메소드 왼쪽의 void는 메소드 안의 코딩에서 리턴되는 데이터가 없다는 뜻.
	그런데 메소드 안에서 return emp_no;에 의해 데이터가 리턴 되고 있어서 에러가 발생한다.
	즉, 메소드의 리턴 자료형과 실제 리턴되는 자료형이 일치하지 않음
	
---------------------------------------------
<문제> private String emp_name;은 속성변수를 선언하고 데이터를 저장하지는 않았다. 
	즉, 속성변수를 선언만 하고 데이터를 저장하지 않으면 속성변수 안에는 
	정말 아무 데이터도 없는가?
---------------------------------------------
	속성변수를 선언만 하고 데이터를 저장하지 않으면
	java가 default값을 자동으로 넣어준다 => 0, null
	
	왜? 속성변수는 객체를 구성하는 중요한 멤버이기 때문에
	
	속성변수 자료형이 byte, short, int, long (정수형)면 default로 0 을 넣어준다.
	속성변수 자료형이 float, double (실수형)면 default로 0.0 을 넣어준다.
	속성변수 자료형이 char면 dafault로 '' 을 넣어준다.
	속성변수 자료형이 boolean면  default로 false 를 넣어준다.
	
	속성변수 자료형이 참조형이면 default로 null 을 넣어준다.
	
---------------------------------------------	
<참고> null의 정의		*입
---------------------------------------------
	객체의 메모리 위치 주소값이 아직은 없다. 
	추후에 들어갈 예정이다. 이거 가지고 있어라.
	
	분명히 null도 데이터 취급한다. 참조형
	
	일종의 더미 데이터.
	더미 : 형체만 있고 기능은 없는 대상물	ex) 마네킹, 
	
---------------------------------------------
<문제> 아래처럼 코딩을 수정하면?
---------------------------------------------	
	public String getEmp_name(){
		return emp_name;
	}
---------------------------------------------
				▼
---------------------------------------------	
	public String getEmp_name(){
	
	}	
---------------------------------------------
	에러 발생.
	
	메소드 왼쪽에 자료형이 String이니까 리턴 데이터가 String인 데이터가 리턴할 것이라는 뜻
	메소드 안에서 return 문자;가 없어서 에러가 발생한다.

	즉, 메소드의 리턴 자료형은 String인데 실제 리턴되는 데이터는 없어서 에러 발생한다.
	
	메소드 왼쪽의 리턴 자료형과 안쪽의 실제 리턴되는 자료형이 일치해야 함
	
	void로 수정하면 에러 없음

---------------------------------------------
<문제> return emp_name;의 의미를 설명하면?
---------------------------------------------
	return 데이터 또는 변수;
---------------------------------------------
		return 오른쪽에 데이터 또는 변수 안의 데이터를 리턴하고 메소드는 중단하라.
		return 오른쪽의 데이터의 자료형과 메소드명 왼쪽의 리턴자료형이 일치해야 한다.
---------------------------------------------		
	<주의> return;
---------------------------------------------
		메소드를 중단해라.
		return; 가 있으면 메소드명 왼쪽에 void 가 나와야 한다.		
==================================================================		
	메소드의 실행구문에서 				메소드명 왼쪽 리턴자료형
==================================================================
	return 실수형;						~ double 메소드명(~){~}
	return 정수형;						~ int|double 메소드명(~){~}
	return boolean형;					~ boolean 메소드명(~){~}
	return "문자";						~ String 메소드명(~){~}
	return '문자';						~ char 메소드명(~){~}
	return 객체의 메위주;				~ 객체의전신클래스명 메소드명(~){~}
	return;								~ void 메소드명(~){~}
------------------------------------------------------------------
<주의> 하나의 메소드 안에서 return 데이터;와 return;가 동시에 같이 나올 수 있나?
------------------------------------------------------------------
	절대 없다. 나온다면 에러
	
---------------------------------------------
<문제> 
---------------------------------------------	
	public String xxx(){
		return;
	}
	=> 에러 발생. String형을 리턴하자고 했는데 리턴 되는게 없네
	void로 고치면 에러 안나겠다.
	
	public String xxx(){
		return null;
	}
	=> 에러 없음. 속성변수 자료형이 참조형이면 default로 null 을 넣어준다.
	null도 참조형 취급하니까
	
---------------------------------------------
<정리> 
---------------------------------------------		
	반복문의 스나이퍼	=> 	break;
	switch문의 스나이퍼 => 	break;
	메소드의 스나이퍼	=> 	return;
	if문의 스나이퍼 	=> 	없음

---------------------------------------------
<문제> public Employee (int emp_no, String emp_name){~} 코딩 밑에
		public Employee (	){}	를 추가 하면?
---------------------------------------------
가능. 
생성자는 0개 이상 선언 가능

단, 생성자가 2개 이상일 때는 생성자의 매개변수 개수가 다르거나 개수가 같으면 자료형이 달라야 한다.

이때, 생성자를 2개 이상 선언하는 행위를 생성자 오버로딩(constructor overloading)이라고 한다.
---------------------------------------------
< 생성자 오버로딩(constructor overloading) 규칙>
---------------------------------------------	
생성자명이 클래스명과 동일해야 한다.
생성자 앞에는 리턴형이 없어야 한다. 
생성자의 매개변수 개수가 다르거나 개수가 같으면 자료형이 달라야 한다.

---------------------------------------------
<문제> public Employee (int emp_no, String emp_name){~} 코딩 밑에
		public Employee (int emp_no2, String emp_name2){~}	를 추가 하면?
---------------------------------------------
불가능. 매개변수 개수 같고 자료형도 같으니까 에러
생성자 오버로딩 규칙 위반

---------------------------------------------
<문제> public Employee (int emp_no, String emp_name){~} 코딩 밑에
		public Employee (String emp_name, int emp_no){~}	를 추가 하면?
---------------------------------------------
가능. 자료형이 다르니까

---------------------------------------------
<문제> private String emp_name; 를
	private final String emp_name; 로 수정하면?
---------------------------------------------	
에러 발생

에러 발생 지점 => this.emp_name = emp_name;
 
에러 발생 이유는 => final이 붙은 속성변수는 초기화 후 갱신이 불가능하다.
 					그런데 this.emp_name = emp_name;에서 속성변수 emp_name의 데이터 갱신을 시도하니까 에러 발생
 					this.emp_name = emp_name;은 속성변수 emp_name의 데이터를 갱신했기 때문이다
 					
<주의> 속성변수는 선언 후에 초기화하지 않으면 자동초기화 된다. 
		즉, 선언 후에 데이터를 저장하지 않으면 기본값을 넣어준다.
		그만큼 중요한 멤버이기 때문이다. 
		단 예외적으로,  final이 붙은 속성변수는 개발자가 초기화하지 않으면 자동초기화 되지 않는다.
		그러므로 final이 붙은 속성변수는 선언하자마자 초기화 해주던가 
		아니면 생성자 안에서 초기화 해주어야 한다. 
 		

---------------------------------------------
<문제> 위 Employee 클래스를 [클래스 다이어그램]으로 표시하면?
---------------------------------------------	
[클래스 다이어그램] : 클래스 구조를 표형식으로 표현한 것. 프로젝트 산출물에 삽입된다. 

		---------------------------------------------
		com.google.erp.Employee
		---------------------------------------------
		-emp_no:int
		-emp_name:String
		---------------------------------------------
		+Employee(emp_no:int, emp_name:String)
		---------------------------------------------
		+getEmp_no():int
		+setEmp_no(emp_no:int):void
		+getEmp_name():String
		+setEmp_name(emp_name:String):void
		---------------------------------------------

---------------------------------------------
<문제> 다음 중 생성자 오버 로딩이 잘못된 것을 골라라.
---------------------------------------------	
	public class Bank{
		public Bank(){}
		public Bank(int money){}
		public Bank(double money){}
		public Bank(int money, String account){}
		public void Bank(String account, int money){}		에러. 생성자는 리턴형이 있으면 안된다. 리턴형은 메소드만 있어야 함
		public Bank(int money2, String account2){}			에러. 매개변수 개수 똑같고 자료형도 똑같음
	}
	
---------------------------------------------
<문제> 다음 중 메소드 오버 로딩이 잘못된 것을 골라라.
---------------------------------------------	
	public class Bank{
		public int getMoney(){~}
		public int getMoney(int money){~}
		public int getMoney(double money){~}
		public int getMoney(int money, String account){~}
		public int getMoney(String account, int money){~}
		public int getMoney(int money2, String account2){~}		에러. 매개변수 개수 똑같고 자료형도 똑같음
	}
	---------------------------------------------
	메소드 오버로딩 규칙
	---------------------------------------------
	메소드 명이 동일해야 한다.
	매개변수의 개수가 다르거나 개수가 같으면 자료형이 달라야 한다. 







	
*/
