package com.mycom.word;

public interface ICRUD { // 네 개의 함수를 정의
    public Object add(); // 데이터 추가
    public int update(Object obj); // 데이터 수정
    public int delete(Object obj); // 데이터 삭제
    public void selectOne(int id); // 데이터 한 개를 조회
}
