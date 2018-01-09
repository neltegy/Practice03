package com.javaex.problem08;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	int statecode;
	public Book() {
		super();
	}
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		statecode = 1;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		statecode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	public void print() {
		if(statecode == 1) {
			System.out.println("재고있음");
		}else if(statecode == 0) {
			System.out.println("대여중");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
}
