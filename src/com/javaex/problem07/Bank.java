package com.javaex.problem07;

import java.util.Scanner;

public class Bank {
	static int deposit = 0;
	static int withdraw = 0;
	static int balance = 0;

	static int deposit() { // 예금
		System.out.print("예금액>");
		deposit = scan.nextInt();
		balance = deposit + balance;
		return 0;
	}

	static int withdraw() { // 출금
		System.out.print("출금액>");
		withdraw = scan.nextInt();
		balance = balance - withdraw;
		return 0;
	}

	static int balance() { // 잔고
		System.out.println("잔고액>" + balance);
		return 0;
	}

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		System.out.println("계좌 1111-1111-1111이 설계되었습니다.");
		while (flag) {
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.print("선택:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				balance();
				break;
			case 4:
				System.out.println("프로그램종료");
				flag = false;
				break;
			default:
				System.out.println("다시입력해주세요");
			}
		}

	}

}
