package javastandard;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for(int i=0; i<CARD_NUM; i++){
            int num = i%10+1;
            boolean isKwang = (i<10) && (num==1||num==3||num==8);

            cards[i] = new SutdaCard2(num,isKwang);
        }
    }

    void shuffle() {
        for (int j=0; j<cards.length; j++){
            int k = (int)(Math.random()*cards.length);

            SutdaCard2 tmp = cards[j];
            cards[j] = cards[k];
            cards[k] = tmp;

        }
    }

    SutdaCard2 pick() {

        return cards[(int)(Math.random()* cards.length)];
    }

    SutdaCard2 pick(int index){
        if(index <0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }
}

class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1,true);
    }

    public SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Excercise_7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+ ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
