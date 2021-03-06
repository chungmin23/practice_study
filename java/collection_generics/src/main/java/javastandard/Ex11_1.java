package javastandard;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        //객체 생성
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //중간에 가져오기
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        //정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        //list1이 list2의 모든 요소를 포함하고 있을때 true 공집합
        System.out.println("list1.containAll(list2):"+list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 3번째 자리에 A 추가
        print(list1,list2);

        list2.set(3, "AA"); // 3번째 자리에 AA로 변경
        print(list1,list2);

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1,list2);

        //LIST2에서 list1에 포함된 객체들을 삭제한다
        for(int i= list2.size()-1; i>= 0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1,list2);

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
