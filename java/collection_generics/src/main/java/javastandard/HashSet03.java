package javastandard;

import java.util.*;

public class HashSet03 {
    public static void main(String[] args) {
        Set set = new HashSet();

        //중복 제거
        for(int i=0; set.size()<6; i++){
            int num = (int)(Math.random()*10) + 1;
            set.add(new Integer(num));
        }

        //크기 순서대로 하기위해 리스트로 변환
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
