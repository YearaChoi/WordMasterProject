package com.mycom.word;

import java.util.Scanner;

public class WordManager { // CRUD기능을 구현하는 전체적인 관리 역할을 수행함
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu(){
        System.out.print("*** 영단어 마스터 ***\n"
                + "********************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "********************\n"
                + "=> 원하는 메뉴는? ");
        return s.nextInt(); // 사용자에게서 원하는 메뉴 받아오기
    }
    public void start(){

        wordCRUD.loadFile();
        while(true) {
            int menu = selectMenu(); // 리턴된 값을 그대로 출력
            if(menu == 0) break;
            if(menu == 4){
                // 데이터를 추가하는 구문
                wordCRUD.addItem();
            }
            else if(menu == 1){
                // 리스트를 보여주는 구문
                wordCRUD.listAll();
            }
            else if(menu == 2){
                // 리스트를 보여주는 구문
                wordCRUD.searchLevel();
            }
            else if(menu == 3){
                // 리스트를 보여주는 구문
                wordCRUD.searchWord();
            }
            else if(menu == 5){
                // 데이터를 수정하는 부분
                wordCRUD.updatItem();
            }
            else if(menu == 6){
                // 데이터를 삭제하는 부분
                wordCRUD.deleteItem();
            }
            else if(menu == 7){
                // 데이터를 파일에 저장하는 부분
                wordCRUD.saveFile();
            }
        }
    }
}
