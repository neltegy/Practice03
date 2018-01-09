package com.javaex.problem06;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        ArrayList<String> arr = new ArrayList<String>();
        
            // 친구정보 입력받기
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
            // 입력받은 친구정보를 공백으로 분리
        String[] sp1 = str1.split(" ");
        String[] sp2 = str2.split(" ");
        String[] sp3 = str3.split(" ");
        
            // Friend 객체 생성하여 데이터 넣기
        Friend fr1 = new Friend(sp1[0],sp1[1],sp1[2]);
        Friend fr2 = new Friend(sp2[0],sp2[1],sp2[2]);
        Friend fr3 = new Friend(sp3[0],sp3[1],sp3[2]);
            // 배열에 추가하기
        friendArray[0] = fr1;
        friendArray[1] = fr2;
        friendArray[2] = fr3;
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
