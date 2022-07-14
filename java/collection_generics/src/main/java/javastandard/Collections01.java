package javastandard;

import java.util.*;
import static java.util.Collections.*;


public class Collections01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        //값 저장
        addAll(list,1,2,3,4,5);
        System.out.println(list);

        //오른쪽을 2칸 이동
        rotate(list,2);
        System.out.println(list);

        //값 교환
        swap(list,0,2);
        System.out.println(list);

        //저장된 요소의 위치를 임의로 변경
        shuffle(list);
        System.out.println(list);

        //역순 정렬
        sort(list,reverseOrder());
        System.out.println(list);

        //정렬
        sort(list);
        System.out.println(list);

        //3이 어디에 저장되어 위치 찾기
        int idx = binarySearch(list,3);
        System.out.println("index of 3 = "+ idx);

        System.out.println("max="+max(list));
        System.out.println("max="+min(list));
        //최소값을 이런식으로 쓸수 있다
        System.out.println("max="+max(list,reverseOrder()));

        fill(list,9);
        System.out.println("list="+list);

        //5개 짜리 배열을 만들고 2로 채움
        List newList = nCopies(list.size(),2);
        System.out.println("newList"+newList);

        // 공통요소가 없으면 참
        System.out.println(disjoint(list,newList));

        copy(list,newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list,2,1);
        System.out.println("list="+list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2="+list2);

    }
}
