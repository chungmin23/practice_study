package javastandard;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 정렬 필요없음, 이미 되어 있음
        //Set set = new HashSet(); // 정렬필요

        for(int i =0; set.size() <6; i++){
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
        }

        System.out.println(set);
    }
}
