package com.google.erp;

public class CoffeeMachine {
	// 속성변수 선언
	
	// 속성변수 선언 형식
	// public|protected|default|private [static] [final] 기본자료형|클래스명|인터페이스명 속성변수명[=데이터];
	
	// 속성변수는 보통 private
	
	private String coffee_name;
	private String hot_or_ice;
	private int price;
	private String purchaser;
	
	// 생성자 선언
	
	// 생성자 선언 형식
	// public|protected|default|private 생성자명([자료형 매개변수,~]){ 실행구문;}
	
	public CoffeeMachine(
			String coffee_name, String hot_or_ice, int price, String purchaser) {
		this.coffee_name = coffee_name;
		this.hot_or_ice = hot_or_ice;
		this.price = price;
		this.purchaser = purchaser;
	}
	
	// 메소드 선언
	// coffee, hot or ice, price, 주문자

	// 메소드 선언 형식
	// public|protected|default|private [static] [final|abstract] 기본자료형|클래스명|인터페이스명|void 메소드명([자료형 매개변수,~]){ 실행구문;}
	
	// 매소드는 보통 public
	
	public String getCoffee_name() {
		return coffee_name;
	}
	public String getHot_or_ice() {
		return hot_or_ice;
	}
	public int getPrice() {
		return price;
	}
	public String getPurchaser() {
		return purchaser;
	}
	
	// 메뉴나 hot/ice 여부를 바꾸는 상황도 이싸
	// 수정 메소드 만들기
	
	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}
	public void setHot_or_ice(String hot_or_ice) {
		this.hot_or_ice = hot_or_ice;
	}
	
	
	
	
	
	
}
