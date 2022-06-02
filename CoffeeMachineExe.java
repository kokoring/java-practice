package com.google.erp;

// CoffeeMachine 클래스를 객체화 해서 메소드를 호출 해보자
public class CoffeeMachineExe {

	public static void main(String[] args) {
		CoffeeMachine coffeemachine = new CoffeeMachine("Americano", "ice", 0, "kim-rg");
		//
		// 클래스명 객체참조변수 = new 생성자명 (속성변수에 들어갈 매개변수값들)
		// new의 역할
		
		// 메소드 호출해보자
		
		System.out.println("Coffee : " + coffeemachine.getCoffee_name());
		System.out.println("Hot / Ice : " + coffeemachine.getHot_or_ice());
		System.out.println("Price : " + coffeemachine.getPrice());
		System.out.println("Purchaer : " + coffeemachine.getPurchaser());
		
		// 주문자가 메뉴를 바꿨다면?
		// 수정할 메소드가 필요하다
		
		coffeemachine.setCoffee_name("Latte");
		
		System.out.println("Coffee : " + coffeemachine.getCoffee_name());
	
		coffeemachine.setHot_or_ice(null);
		System.out.println("Hot / Ice : " + coffeemachine.getHot_or_ice());
	}

}
