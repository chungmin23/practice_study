package javastandard;


import java.util.*;

public class Excercise_11_1 {
    public static void main(String[] args) {
        ArrayList list  = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet set = new HashSet(list); // 2,6,3,7 중복요소 제거 순서유지 안됨
        TreeSet tset = new TreeSet(set); // 오름차순으로 정렬 2,3,6,7
        Stack stack = new Stack(); 
        stack.addAll(tset); // 저장된 요소를 stack 담음

        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
