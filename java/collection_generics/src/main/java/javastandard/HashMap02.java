package javastandard;

import java.util.*;
public class HashMap02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바",90);
        map.put("김자바",100);
        map.put("이자바",100);
        map.put("강자바",80);
        map.put("안자바",90);

        //hashMap저장된 키와 값을 엔트리 형태 set으로 저장해서 변환
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+ e.getKey()+"점수 : "+ e.getValue());
        }

        //키값들이 set으로 변경
        set = map.keySet();
        System.out.println("참가자 명단 : "+ set);

        //값을 컬렉션 형태로 반환
        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()){
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+ (float)total/set.size());
        System.out.println("최고점수 : "+ Collections.max(values));
        System.out.println("최저점수 : "+ Collections.min(values));


    }
}
