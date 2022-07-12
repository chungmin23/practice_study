class MyMath2{
    long a,b;

    //인스턴스 메서드는 인스턴스 변수를 이용해서 값을 리턴
    long add()  { return a+b;}
    long substract()  { return a-b;}
    long multiply()  { return a*b;}
    long divide()  { return a/b;}


    //static메서드는 바로 선언하여 사용 가능, 매개변수를 이용하여 리턴
    static long add(long a, long b) { return  a+b;}
    static long substract(long a, long b) { return  a-b;}
    static long multiply(long a, long b) { return  a*b;}
    static long divide(long a, long b) { return  a/b;}
}



public class static_instance_method {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.substract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));

        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
