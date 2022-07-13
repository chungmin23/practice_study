public class Exercise_6_2 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동",1,1,100,60,76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student2 {

    String name;
    int bao;
    int no;
    int kor;
    int eng;
    int math;


    public Student2(String name, int bao, int no, int kor, int eng, int math) {
        this.name = name;
        this.bao = bao;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    public String info() {
        return "name='" + name + '\'' +
                ", bao=" + bao +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math
                ;
    }
}
