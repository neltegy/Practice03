package com.javaex.problem06;

import java.util.Scanner;

public class Friend {

    private String name;
    private String hp;
    private String school;

    //필요한 메소드 작성  //필요한 메소드가 없고 생성자를 적었습니다.
    public Friend() {}

    public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
    
    
   
	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }


	

}
