package codestates;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // TreeSet 생성
        TreeSet<String> workers = new TreeSet<>();

        // TreeSet에 요소 추가
        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim Coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee")); // data1보다 큰값중에 최소값
        System.out.println(workers.subSet("Kim", "Park")); //범위검색 결과값
    }
}