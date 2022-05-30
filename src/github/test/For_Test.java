package github.test;

public class For_Test {

	public static void main(String[] args) {
		
		// for문 사용하여 문자 10번 출력
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello World");
		}
		
		// i 초기값을 0으로 설정, i<10이라는 조건식 만족하는지 보고, (i가 0이니까 조건 만족)
		// 실행구문 쪽의 Hello World 문자 출력으로 가서 출력
		// for문의 i++ 증감식으로 가서 0에서 1로 i값이 증가
		// 다시 i가 1로 1<10 만족하니까 다시 실행구문 출력
		// 위 과정을 조건식이 만족하지 않을 때까지 반복
		
		// 1부터 5까지 더한 결과값 출력
		
		int tot = 0;	
		for( int i=1; i<=5; i++) {
			tot = tot + i;
		}
		System.out.println(tot);
		
		// break를 사용한다면
		
		tot=0;
		
		for(int i=1; i<=5; i++) {
			if(i==6) {
					break;
			
			}
			tot = tot + i;
		}
		System.out.println(tot);
		
		// for문 사용하여 1부터 10까지 더하되 홀수만 골라서 더한 결과 출력하기
		
		tot=0;
		
		for(int i =1; i<=10; i++) {
			if(i%2!=0) {
				tot = tot+i;
			}
		}
		System.out.println(tot);
		
		// % 연산자를 사용하지 않으려면?
		
		tot=0;
		
		for(int i =1; i<=10; i +=2) {
			tot = tot+i;
		}
		System.out.println(tot);
		
		// continue를 사용해보면?
		
		tot=0;
		
		for(int i=1; i<11;i++) {
			if(i%2==0) {
				continue;
			}
			tot = tot+i;
		}
		System.out.println(tot);
		
		
		// for문 사용하여 10부터 1까지 거꾸로 더한 결과 출력하기
		
		tot=0;
		
		for(int i =10; i>0; i--) {
			tot = tot + i;
		}
		System.out.println(tot);
		
		
		// for문 사용하여 1~60까지 더하되 40번대 숫자 제외하고 더한 결과 출력하기
		
		tot=0;
		
		for(int i=1; i<61; i++) {
			if(i<40 || i >=50) {	// 1~39까지 더하고, 50~60까지 더하는 것
				tot = tot + i;
			}
		}
		System.out.println(tot);
		
		// 아니면
		
		tot=0;
		
		for(int i=1; i<61; i++) {
			if(!(i>=40 && i<50)) {
				tot = tot + i;
			}
		}
		System.out.println(tot);
		
		// for문 사용하여 1~10까지 곱한 결과 출력해보기
		
		tot=1;	// tot가 0이면 안됨. 0*n은 계속해서 0이니까
		
		for(int i=1; i<11; i++) {
			tot = tot * i;
		}
		System.out.println(tot);
		
		// for문 이용해서 구구단 출력해보기 > 3단
		
		for(int i=1; i<=9; i++) {
			System.out.println(" 3 x " + i + " = " + 3*i);
		}
		
		// for문 사용해서 1단부터 9단까지 출력해보기
		/*
		1 x 1 =1   2 x 1 =2    ~  9 x 1 = 9
		1 x 2 =2   2 x 2 =4    ~  9 x 2 = 18
		1 x 3 =3   2 x 3 =6    ~  9 x 3 = 27
		1 x 4 =4   2 x 4 =8    ~  9 x 4 = 36
		1 x 5 =5   2 x 5 =10   ~  9 x 5 = 45
		1 x 6 =6   2 x 6 =12   ~  9 x 6 = 54
		1 x 7 =7   2 x 7 =14   ~  9 x 7 = 63
		1 x 8 =8   2 x 8 =16   ~  9 x 8 = 72
		1 x 9 =8   2 x 9 =18   ~  9 x 9 = 81
	*/
		for(int j=1; j<10; j++) {
			for(int i=1; i<10; i++) {
				System.out.print(i + " x " + j + " = " + i*j + "   ");
			}
			System.out.println();	
		}
		
		// 구구단에서 4단은 제외하고 출력해보기
		
		for(int j=1; j<10; j++) {
			for(int i=1; i<10; i++) {
				if(i!=4) {
				System.out.print(i + " x " + j + " = " + (i*j) + "   ");
				}
			}
			System.out.println();	
		}		
		
		// 구구단 출력하는데 결과가 49일때까지만 출력하기
		
		int no = 49;
		
		for( int i=1; i <10; i++) {
			int j=1;	// 변수 j를 밖으로 빼놔야 밖에 있는 if 문에서도 변수 j를 사용할 수 있음
			for(; j<10; j++) {
				System.out.print(i + " x " + j + " = " + (i*j) + "   ");
				if(i*j==no) {	// 이 안에 있는 반복문만 종료되어서 두번째 if문이 종료되지 않음
					break;	
				}
			}
			if(i*j==no) {	// 바깥에 있는 for문도 빠져나오기 위해서. 
				break;		// 두번째 if문에 대한 break가 없으면 다시 첫번째 i에 대한 for문으로 돌아가서 다시 반복 실행
			}
			System.out.println();
		}

		// 다른 방법
		
		no = 49;
		
		zzz: for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i + " x " + j + " = " + (i*j) + "   ");
				if(j*i==no) {
					break zzz; // if문 조건 만족하면 zzz 구문에서 벗어나라
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 1~10까지의 숫자 중에 소수만 골라 출력해보기
		
		// 소수의 특징 : 1과 나 자신으로만 나눠짐
		
		int cnt=0;
		
		for( int i=2; i<=10; i++) {
			cnt=0;
			for( int j=1; j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}			
			}
			if(cnt==2) {
				System.out.println(i);
			}
		}
		
		// 1 ~ 100 까지 더한 누적 합이 50 미만일 때까지만 더하고 출력
		// 즉, 누적합이 50을 넘어가기 바로 전의 합 출력하기
		
		tot=0;
		
		for(int i=1; i<101; i++) {
			tot = tot + i;
			if(tot>=50) {
				tot = tot - i; break;
			}
		}
		System.out.println(tot);
		
		// 아니면?
		
		tot=0;
		
		for(int i=1; i<=100; i++) {
			if(tot + i >=50) {break;}
			tot = tot + i;
		}
		System.out.println(tot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
