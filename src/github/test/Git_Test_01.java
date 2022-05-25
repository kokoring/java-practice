
/* 아래 클래스의 소속 패키지 선언
 * 모든 클래스 최상단에는 무조건 패키지 선언 등장 */

package github.test;

/* Git_Test_01 이라는 클래스 선언
 * 클래스 이름은 관용적으로 대문자로 시작
 * 클래스 이름은 유의미하게 부여 */

public class Git_Test_01 {

	/* JVM이 찾아서 호출하는 main method 선언 */
	
	public static void main(String[] args) {
	
	/* 학생번호를 저장하기 위해 int형 데이터를 저장할 메모리 공간 확보,
	 * 이 곳 이름을 student_no 라고 명한다 > 변수 선언
	 * 
	 * 학생번호 저장하기 위해 student_no 라는 변수 선언
	 * 
	 * student_no 라는 변수에 데이터 값 1 저장 */
		
	int student_no;
	student_no = 1;
	
	// 변수 선언과 동시에 데이터 저장
	// int student_no = 1;
	
	
	
	/* 학생이름을 저장하기 위해 
	 * [String 객체]의 메모리 위치 주소값을 저장할 메모리 공간 확보,
	 * 이 곳 이름을 student_name 이라고 명한다 > 변수 선언
	 * 
	 *  문자 "KOKO"를 관리하는 String 객체를 생성하여 메모리에 올리고
	 *  이 객체의 메모리 주소값을 변수 student_name에 저장 */
	
	String student_name = "KOKO";
	
	// String student_name = new String ("KOKO")
	
	String birth_day = "2022-05-25";
	
	char gender = 'M';
	
	boolean is_married = false;
	
	String jumin_num = "220525-3030303";
	
	double weight = 4.67;
	
	// weight 값이 4.67에서 4.64로 갱신
	// 값을 갱신하지 못하게 하려면?
	// final 상수 선언
	// final double weight = 4.67;
	
	weight = 4.64;
	
	double tall = 55;
	
	double kor = 90;
	double mat = 56.5;
	
	double tot = kor + mat;
	
	// tot가 실수니까 /2 해도 실수로 형변환 됨
	
	double avg = tot / 2;
	
	System.out.println("학생번호 : " + student_no);
	System.out.println("학생이름 : " + student_name);
	System.out.println("생일 : " + birth_day);
	System.out.println("몸무게 : " + weight + "kg");
	System.out.println("키 : " + tall + "cm");
	System.out.println("결혼여부 : " + is_married);
	System.out.println("성별 : " + gender);
	System.out.println("주민번호 : " + jumin_num);
	System.out.println("국어점수 : " + kor);
	System.out.println("수학점수 : " + mat);
	System.out.println("총점 : " + tot);
	System.out.println("평균 : " + avg);
	
	
	
	}

}
