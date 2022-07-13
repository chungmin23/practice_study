package javastandard;

class Outer2 {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise_7_7 {
    public static void main(String[] args) {
        Outer2.Inner ii = new Outer2.Inner();
        System.out.println(ii.iv);
    }
}
