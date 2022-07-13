

public class Exercise_6_21 {

    static int abs(int num){
//        if(num<0){
//            num *= -1;
//        }
//        return num;
        return num >=0 ? num : -num;
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:"+ abs(value));
        value = -10;
        System.out.println(value + "의 절대값:"+ abs(value));

    }
}
