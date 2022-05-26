package github.test;

public class Git_Test_02 {

	public static void main(String[] args) {
		
		int kor = 80;
		int eng = 100;
		int mat = 44;
		
		int tot = kor + eng + mat;
		
		
		double avg = tot / 3.0;
		
		// double avg = tot / 3;
		
		System.out.println("총점 : " + tot);
		
		System.out.println("평균 : " + avg);
		// System.out.println(avg);
		
		// 평균은 실수로 나올 수 있는 값
		// 정수/정수 -> 정수
		// 정수/실수 -> 실수
		
		
		char grade = 'F';
		
		// 1. if문만 사용하기
		
		if(avg <= 100 && avg >= 90) {
			grade = 'A';
		}
		if(avg <90 && avg >= 80) {
			grade = 'B';
		}
		if(avg <80 && avg >= 70) {
			grade = 'C';
		}
		if(avg <70 && avg >= 60) {
			grade = 'D';
		}
		
		// 2. if ~ else if
		
		if(avg <=100 && avg >= 90) {
			grade = 'A';
		}
		else if(avg <90 && avg >= 80) {
			grade = 'B';
		}
		else if(avg <80 && avg >= 70) {
			grade = 'C';
		}
		else if(avg <70 && avg >= 60) {
			grade = 'D';
		}
		
		// 3. if ~ else if ~ else
		
		// 평균이 잘못 나오는 경우를 위해 
		// 예를 들면, 100보다 크거나 0보다 작게 나오는 경우
		// flag 변수 선언하고 true나 false값 저장
		
		boolean flag = true;
		
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg >=80) {
			grade = 'B';
		}
		else if(avg >=70) {
			grade = 'C';
		}		
		else if(avg >=60) {
			grade = 'D';
		}
		else if(avg >=0) {
			grade = 'F';
		}
		else if(avg > 100) {
			System.out.println("경고 ! 평균이 100보다 크다");
			flag = false;
		}
		else { 
			System.out.println("경고 ! 평균이 0보다 작다.");
			flag = false;
			}
		
		// 평균이 잘못 나오는 경우를 위해 
		// 예를 들면, 100보다 크거나 0보다 작게 나오는 경우
		// flag 변수 선언하고 true나 false값 저장
		
		// flag가 true인 경우에만 학점 출력, 아니면 경고만 출력
		
		
		if(flag==true) {
			System.out.println("학점 : " + grade);
		}
		
		
		
		//------------------------------------------------------
		// 평균 75 이상이면 "PASS" 출력
		// 평균 75 이하이면 "NON PASS" 출력
		//------------------------------------------------------
		// 1.if ~ else
		
		if(avg>=75) {
			System.out.println("PASS");
		}
		else {
			System.out.println("NON PASS");
		}
		
		// 2. String
		
		String result = "PASS";
		
		if(avg <75) {
			result = "NON PASS";
		}
		System.out.println(result);
		
		// 3. 삼항 연산자
		
		result = (avg>=75)?"PASS":"NON PASS";
		System.out.println(result);
		
		
		//------------------------------------------------------
		// 아래 조건 만족하면 PASS 출력, 만족하지 못하면 NON PASS 출력
		// 조건 : 평균 60 이상이면서 각 과목이 40 이상
		//------------------------------------------------------
		
		// 논리연산자 사용 안해보기
		// 중첩 if문
		
		result = "NON PASS";
		
		if(avg>=60) {
			if(kor>=40) {
				if(eng>=40)
					if(mat>=40) {
						result = "PASS";
					}
					
			}
		}
		System.out.println(result);
		
		// 논리연산자 사용
		
		if(avg>=60) {
			if(kor>=40 && eng >=40 && mat >=40) {
				result = "PASS";
			}
		}
		System.out.println(result);
		
		// 조건을 한줄로 하면
		
		if( avg>=60 
				&&
				(kor >=40 && eng >=40 && mat >=40)
				) {
			result = "PASS";
		}
		else {
			result = "NON PASS";
		}
		System.out.println(result);
		
		// 증감연산자 사용
		
		int cnt = 0;
	
		if(kor>=40){cnt++;} // 조건 만족하면 cnt 값이 1 증가
		if(eng>=40){cnt++;}
		if(mat>=40){cnt++;}
		
		if(avg>=60) {
			if(cnt>=2) {
				result = "PASS";
			}			
		}
		else {
			result = "NON PASS";
		}
		System.out.println(result);
		
		//-------------------------------------------
		// switch 구문 사용
		// 평균 80 이상이면 PASS 출력
		// 평균 80 미만이면 NON PASS 출력
		//-------------------------------------------
		
		// switch 구문의 조건식 결과는 무조건 정수
		
		// 평균을 10으로 나눴을 때 몫이 8, 9, 10이면 PASS
		// 몫이 0~7이면 NON PASS
		
		int avg2 = (int)avg ;
		
		int num = avg2 / 10;
		
		System.out.println(avg2);
		System.out.println(num);
		
		switch(num) {
		case 10 :
		case 9 : 
		case 8 : result = "PASS"; break;
		case 7 :
		case 6 :
		case 5 :
		case 4 :
		case 3 :
		case 2 :
		case 1 :
		case 0 : result = "NON PASS"; break;
		default : result = "계산 불가"; break;
			}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
