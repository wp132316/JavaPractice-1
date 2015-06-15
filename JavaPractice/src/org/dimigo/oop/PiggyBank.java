package org.dimigo.oop;

public class PiggyBank {
	private int balance = 0;
	
	public void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName()+" "+amount+"원 넣음");
	}
	
	public void	printBalance() {
		System.out.println("돼지저금통 총 금액 : "+balance+"원");
	}
}
