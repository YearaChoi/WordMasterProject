package com.mycom.word;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD { // ICRUD를 구현한 구현체문
    ArrayList<Word> list;
    Scanner s; // 사용자에게 입력을 받아와야 함

    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }
    @Override  //사용자에게 입력받는 부분
    public Object add() {
        System.out.println("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();
        // 1 driveway
        System.out.println("뜻 입력 : ");
        String meaning = s.nextLine();
        // 차고 진입로

        return new Word(0, level, word, meaning);
    }

    public void addWord(){ // 워드메니저에서 호출할 함수
        // 데이터를 리스트에 추가하는 부분
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll(){
        System.out.println("------------------------------");
        for(int i=0; i< list.size(); i++){
            System.out.print((i+1)+ " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("------------------------------");
    }

}
