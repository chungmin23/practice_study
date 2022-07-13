package javastandard;

class StudaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    StudaDeck() {
        for(int i=0; i<CARD_NUM; i++){
            int num = i%10+1;
            boolean isKwang = (i<10) && (num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang);
        }
    }
}

class SutdaCard{
    int num;
    boolean isKwang;
    
    //생성자
    SutdaCard() {
        // 생성자 자신의 것을 불러옴(중복제거를위해  this()를 사용)
        this(1, true);
    }
    
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Excercise_7_1 {
    public static void main(String[] args) {
        StudaDeck deck = new StudaDeck();

        for(int i=0; i< deck.cards.length; i++){
            System.out.println(deck.cards[i]+",");
        }
    }
}
