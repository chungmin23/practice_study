public class Exercise_6_5 {
    //인스턴스 변수
    int kind;
    int num;

    //클래스 변수
    static int width;
    static int height;

    //지역변수 k,n,card, args
    Exercise_6_5(int k, int n){
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        Exercise_6_5 card = new Exercise_6_5(1,1);
    }
}
