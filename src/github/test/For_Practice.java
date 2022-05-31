package github.test;

public class For_Practice {

	public static void main(String[] args) {
		//-----------------------------------
		// 별 출력 예제
		//----------------------------------
		// Q1. *****
		//---------------------------------
		String star = "*";
		
		for(int i=1; i<6;i++) {
			System.out.print(star);
		}
		System.out.println();
		//----------------------------------
		// Q2. 
		// *
		// *
		// *
		// *
		// *
		//---------------------------------
		for(int i=1; i<6; i++) {
			System.out.println(star);
		}
		//----------------------------------
		// Q3. 
		// *****
		// *****
		// *****
		// *****
		// *****
		//---------------------------------	
		for(int j=1;j<6;j++) {
			for(int i=1; i<6; i++) {
				System.out.print(star);
			}
			System.out.println();
		}
		//----------------------------------
		// Q4.
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		//------------------------------------
				for(int i=1;i<6;i++) {
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.print(i);
				System.out.println();
			}		
		//----------------------------------
		// Q5.
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		//----------------------------------
		for(int j=1; j<6; j++) {
			for(int i=1; i<6; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//----------------------------------
		// Q6. 
		// 12345
		// 23456
		// 34567
		// 45678
		// 56789
		//----------------------------------
		for(int j=1; j<6;j++) {
			for(int i=1; i<j;i += 1) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//-----------------------------------
		// Q7.
		// *
		// **
		// ***
		// ****
		// *****
		//-----------------------------------
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print(star);
			}
			System.out.println();
		}
		//-----------------------------------
		// Q8. 1부터 200까지의 정수 중에서
		// 2 또는 3의 배수가 아닌 수의 총합
		//-----------------------------------
		int tot=0;
		
		for(int i=1; i<=200; i++) {
			if(i%2!=0 && i%3!=0) {
				tot = tot+i;
			}			
		}
		System.out.println(tot);
	
		//-----------------------------------
		// Q9. 1부터 1000까지 숫자 중
		// 3의 배수만 더하는 코드 작성
		//-----------------------------------
		tot=0;
		
		for(int i=1; i<1001; i++) {
			if(i%3==0) {
				tot = tot+i;
			}
		}
		System.out.println(tot);
		
		//------------------------------------
		// Q10.
		//    *
		//   **
		//  ***
		// ****
		//------------------------------------
		for(int i=1; i<5;i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print(star);
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
