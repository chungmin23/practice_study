package javastandard;

import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {
        //중복제거
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        //객체를 추가
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
