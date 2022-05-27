package github.test;

public class Operator_Test {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = ++num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 3;	// 다시 num1을 3으로 초기화
		int num3 = num1++;
		
		System.out.println(num1);
		System.out.println(num3);
		
		// int num2 = ++num1;
		// num1 값을 증가시킨 후에 num2로 저장
		// num1 = 4, num2 = 4
		
		// int num3 = num1++;
		// num1 값 증가 없이 num3으로 저장 하고 나서 num1 증가
		// num 1 = 4, num3 = 3
		
		int num4 = 0;
		int num5 = -3;
		int num6 = num4*2 - --num5 + num5++ - ++num4*3;
		//		   ----		------	 ------	  ------
		//			0		   -4	   -4		1
		// int num6 = 0 - (-4) + (-4) - (1*3) = -3
		
		System.out.println(num4);	// 1
		System.out.println(num5);	// -3
		System.out.println(num6);	// -3
		
		
		int n = 5, m = 2;
		
		int o = n/m;
		
		System.out.println(o);
		
		// 정수/정수 결과는 정수, n/m 결과를 담는 변수 o의 자료형도 정수형(int)
		
		double a = 5, b = 2;
		
		double c = a/b;
		
		System.out.println(c);
		
		int e = 5;
		double f = 2; // 형변환 발생. 2가 2.0으로 변환 되어 f에 저장
		
		double g = e/f; // 5/2.0이니까 2.5 저장
		
		System.out.println(g);
		
		
		
		
	}

}
