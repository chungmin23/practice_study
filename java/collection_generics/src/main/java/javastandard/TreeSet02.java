package javastandard;

import java.util.TreeSet;

public class TreeSet02 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "e";

        set.add("abc");
        set.add("car");
        set.add("dance");
        set.add("elephant");
        set.add("flower");
        set.add("alien");
        set.add("Car");
        set.add("dZZZZ");
        set.add("elevator");
        set.add("bat");
        set.add("disc");
        set.add("dzzzz");
        set.add("fan");

        System.out.println(set);
        System.out.println("range search : from " + from + "to" + to);
        //from 부터 to 이전까지 to는 포함 안됨
        System.out.println("result1 : "+set.subSet(from,to));
        //zzz을 임이로 붙여서 to까지 포함하게함
        System.out.println("result2 : "+set.subSet(from,to + "zzz"));
    }
}
