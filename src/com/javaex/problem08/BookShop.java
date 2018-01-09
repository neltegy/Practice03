package com.javaex.problem08;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] bookarr = new Book[10];
		bookarr[0] = new Book(1,"스테파니메이어","트와일라잇");
		bookarr[1] = new Book(2,"스테파니메이어","뉴문");
		bookarr[2] = new Book(3,"스테파니메이어","이클립스");
		bookarr[3] = new Book(4,"스테파니메이어","브레이킹덤");
		bookarr[4] = new Book(5,"조정래","아리랑");
		bookarr[5] = new Book(6,"김동인","젊은그들");
		bookarr[6] = new Book(7,"김난도","아프니깐청춘이다");
		bookarr[7] = new Book(8,"천상병","귀천");
		bookarr[8] = new Book(9,"조정래","태백산맥");
		bookarr[9] = new Book(10,"원수연","풀하우스");
		System.out.print("대여하고 싶은 책의 번호를 입력하세요:");
		int input = scan.nextInt();
		bookarr[input-1].rent();
		System.out.println("*****도서정보출력하기*****");
		for(int i = 0 ; i < 10; i++) {
			System.out.print(bookarr[i].getBookNo()+"책제목:"
								+bookarr[i].getTitle()+","+"작가:"
								+bookarr[i].getAuthor()+","+"대여유무:");
			bookarr[i].print();
		}
		
	}
}
