package com.mycom.word;

public class Word { // 데이터를 다루기 위해서 만드는 클래스

    private int id; // 단어의 번호
    private int level; // 단어의 레벨
    private String word; // 단어
    private String meaning; // 단어의 뜻

    // 생성자 설정

    Word(){}
    Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    // 외부에서 변경 가능하도록 Getter, Setter 설정

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() { // 원하는 포멧의 문자열 리턴

        String slevel = "";
        for(int i=0; i< level; i++) slevel += "*";
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + " " + meaning;
        return str;
    }
}
